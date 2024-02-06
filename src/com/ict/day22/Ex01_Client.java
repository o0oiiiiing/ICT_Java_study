package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ex01_Client extends JFrame implements Runnable {
	// 화면 구성
	JPanel contentPane;
	JTextField nickName_tf;
	JButton join_bt;
	JPanel card1;
	JPanel card2;
	JTextField input_tf;
	JButton send_bt;
	JTextArea ta;
	JScrollPane jsp;

	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	public Ex01_Client() {
		super("멀티 채팅 ver 0.2");

		setBounds(100, 100, 379, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new CardLayout(0, 0));
		add(contentPane);

		card1 = new JPanel();
		contentPane.add(card1, "login");
		card1.setLayout(new BorderLayout());

		JPanel panel_1 = new JPanel();
		card1.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(2, 1));

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_2);

		JLabel nick = new JLabel("닉네임 : ");
		panel_2.add(nick);

		nickName_tf = new JTextField();
		panel_2.add(nickName_tf);
		nickName_tf.setColumns(10);

		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout2 = (FlowLayout) panel_3.getLayout();
		flowLayout2.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_3);

		join_bt = new JButton("  입장하기  ");
		panel_3.add(join_bt);

		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(Ex01_Client.class.getResource("/images/talk.png")));
		card1.add(img, BorderLayout.CENTER);

		card2 = new JPanel();
		contentPane.add(card2, "chat");
		card2.setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		card2.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout());

		input_tf = new JTextField();
		panel.add(input_tf, BorderLayout.CENTER);
		input_tf.setColumns(10);

		send_bt = new JButton("보내기");
		panel.add(send_bt, BorderLayout.EAST);

		ta = new JTextArea();
		ta.setEditable(false);
		ta.setLineWrap(true);
		ta.setFont(new Font("온글잎 박다현체", Font.PLAIN, 15));
		jsp = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		card2.add(jsp, BorderLayout.CENTER);
		
		// 창 종료 눌렀을 때 (나 접속 해제 할거야~) -> 서버에게 전달
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) { // 접속된 상태
					Ex01_Protocol p = new Ex01_Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
					} catch (IOException e1) {
					}
				} else {
					closed();
				}
			}
		});
		
		// 첫 화면 입장하기 눌렀을 때 서버에 정보를 보낸다. (정보 : cmd 1과 닉네임)
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자 닉네임 받기
				String name = nickName_tf.getText().trim();
				if (name.length() > 0) {
					CardLayout c1 = (CardLayout) contentPane.getLayout();
					c1.show(contentPane, "chat");

					// 서버 접속
					if (connected()) {
						// 닉네임 보내기
						Ex01_Protocol p = new Ex01_Protocol();
						p.setCmd(1);
						p.setMsg(name);
						try {
							out.writeObject(p);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
					nickName_tf.setText("");
					nickName_tf.requestFocus();
				}
			}
		});

		input_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
	}

	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.146", 7009);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {
		}
		return false;
	}

	private void sendMessage() {
		String msg = input_tf.getText().trim();
		if (msg.length() > 0) {
			// 메세지 보내기
			Ex01_Protocol p = new Ex01_Protocol();
			p.setCmd(2);
			p.setMsg(msg);
			try {
				out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		input_tf.setText("");
		input_tf.requestFocus();
	}

	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.out.println("프로그램 종료");
			System.exit(0);
		} catch (Exception e) {
		}
	}
	
	// 서버가 보낸 프로토콜, 메세지를 받는다.
	// 이 부분은 클라이언트와 동일
	// switch문에서 1의 경우는 X
	@Override
	public void run() {
		bk: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Ex01_Protocol p = (Ex01_Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 종료
						break bk;
					case 2: // 메세지
						ta.append(p.getMsg() + "\n");
						ta.setCaretPosition(ta.getText().length());
						break;
					}
				}
			} catch (Exception e) {
			}
		} // 무한 반복
		closed();
	}

	public static void main(String[] args) {
		// AWT에서 관리하는 특별한 스레드 처리 방식
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Ex01_Client cc = new Ex01_Client();
				cc.setVisible(true);
			}
		});
	}
}
