package com.ict.day21;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07_ChatClient extends JFrame implements Runnable{
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton jb;
	 
	// 서버 통신에 필요한 객체
	Socket s = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public Ex07_ChatClient() {
		super("멀티채팅 ver 0.1");
		jp = new JPanel();
		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("온글잎 박다현체", Font.PLAIN, 20));
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jtf = new JTextField(35);
		jb = new JButton("보내기");

		jp.add(jtf);
		jp.add(jb);

		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);

		pack();

		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		connected();
		
		// 종료
	   	this.addWindowListener(new WindowAdapter() {
	   		@Override
	   		public void windowClosing(WindowEvent e) {
	   			// 서버에 exit 메세지를 보내다.
	   			out.println("exit");
	   		}
		});
	   	
	   	jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				 sendMessage();
			}
		});
	   	jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
	   	
	}
	// 서버 접속
	private void connected() {
		try {
			s = new Socket("192.168.0.20", 7007);
			out = new PrintWriter(s.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			new Thread(this).start();
			
		} catch (Exception e) {
		}
	}
	
	// 서버에 보내는 담당
	private void sendMessage() {
		String msg = jtf.getText().trim();
		// PrintWriter는 끝 표시 안함
		// msg += System.lineSeparator();
		out.println(msg);
		jtf.setText("");
		jtf.requestFocus();
	}
	
	// 서버에서 온 메세지 받기
	@Override
	public void run() {
		while (true) {
			try {
				String msg = in.readLine();
				if(msg.equals("~~bye")) {
					break;
				}else {
					jta.append(msg+"\n");
					
					// 문자열 출력 후 화면을 가장 하단으로 잡아 준다.
					jta.setCaretPosition(jta.getText().length());
				}
			} catch (Exception e) {
			}
		} // 무한 루프 끝
		// 종료 메세지를 받은 경우
		closed();
	}
	private void closed() {
		try {
			in.close();
			out.close();
			s.close();
			System.out.println("프로그램 종료");
			
			// 창 닫기
			System.exit(0);
		} catch (Exception e) {
		}
	}
	public static void main(String[] args) {
		// AWT에서 관리하는 특별한 스레드 처리 방식
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Ex07_ChatClient cc = new Ex07_ChatClient();
				cc.setVisible(true);
			}
		});
	}
}
