package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_Client extends JFrame implements Runnable {
	JPanel jp1, jp2, jp3;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton exit_bt, send_bt;
	JButton c_red, c_green, c_blue, c_cyan, c_magenta, c_yellow;
	String[] items = { "10", "20", "30", "40", "50" };
	JComboBox<String> jcom;

	// 그림판
	MyCanvas myCanvas = new MyCanvas();
	int x = -10, y = -10, wh = 10;
	Color color = Color.BLACK;

	// 접속
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	String msg;

	public Ex03_Client() {
		super("그림판 ver 0.2");
		jp1 = new JPanel();

		c_red = new JButton(" ");
		c_red.setBackground(Color.RED);
		c_green = new JButton(" ");
		c_green.setBackground(Color.GREEN);
		c_blue = new JButton(" ");
		c_blue.setBackground(Color.BLUE);
		c_cyan = new JButton(" ");
		c_cyan.setBackground(Color.CYAN);
		c_magenta = new JButton(" ");
		c_magenta.setBackground(Color.MAGENTA);
		c_yellow = new JButton(" ");
		c_yellow.setBackground(Color.YELLOW);

		jcom = new JComboBox<>(items);
		exit_bt = new JButton("나가기");

		jp1.add(c_red);
		jp1.add(c_green);
		jp1.add(c_blue);
		jp1.add(c_cyan);
		jp1.add(c_magenta);
		jp1.add(c_yellow);
		jp1.add(jcom);
		jp1.add(exit_bt);

		jp2 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("돋움", Font.BOLD, 20));
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);

		jp2.setLayout(new GridLayout(0, 2));
		jp2.add(myCanvas);
		jp2.add(jsp);

		jp3 = new JPanel();
		jtf = new JTextField(30);
		send_bt = new JButton("보내기");
		jp3.add(jtf);
		jp3.add(send_bt);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setSize(800, 600);
		setResizable(false);

		// 접속
		connected();

		// 창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) {
					Ex03_Protocol p = new Ex03_Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
					}
				} else {
					closed();
				}
			}
		});

		c_red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		c_green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		c_blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		c_cyan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		c_magenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		c_yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == e.SELECTED) {
					switch ((String) e.getItem()) {
					case "10":
						wh = 10;
						break;
					case "20":
						wh = 20;
						break;
					case "30":
						wh = 30;
						break;
					case "40":
						wh = 40;
						break;
					case "50":
						wh = 50;
						break;

					}
				}
			}
		});
		
		// 메세지 전달
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		// 메세지 전달
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		// 그림 그리기
		myCanvas.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX() + wh / 2;
				y = e.getY() - wh / 2;
				sendServer();
			}
		});
		
		// 종료 버튼
		exit_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (s != null) {
					Ex03_Protocol p = new Ex03_Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
					} catch (Exception e2) {
					}
				} else {
					closed();
				}
			}
		});
	}

	// 접속
	public void connected() {
		try {
			s = new Socket("192.168.0.117", 7777);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 정보 보내기
	public void sendServer() {
		try {
			Ex03_Protocol p = new Ex03_Protocol();
			p.setX(x);
			p.setY(y);
			p.setWh(wh);
			p.setColor(color);
			// p.setMsg(msg);
			p.setCmd(2);
			out.writeObject(p);
		} catch (Exception e) {
		}
	}

	// 정보 보내기
	public void sendMsg() {
		try {
			String msg = jtf.getText().trim();
			if (msg.length() > 0) {
				Ex03_Protocol p = new Ex03_Protocol();
				p.setMsg(msg);
				p.setCmd(1);
				out.writeObject(p);
			}
			jtf.setText("");
			jtf.requestFocus();
		} catch (Exception e) {
		}
	}
	
	// 서버에서 온 정보 받기
	@Override
	public void run() {
		bk: while (true) {
			try {
				Object obj = in.readObject();
				Ex03_Protocol p = (Ex03_Protocol) obj;
				switch (p.getCmd()) {
				case 0: // 접속해제
					break bk;
				case 1: // 메세지
					String msg = p.getMsg();
					jta.append(msg + "\n");
					jta.setCaretPosition(jta.getText().length());
					break;
				case 2: // 그림 그리기
					x = p.getX();
					y = p.getY();
					wh = p.getWh();
					color = p.getColor();

					myCanvas.repaint();
					break;

				}
			} catch (Exception e) {
			}
		} // 무한 반복
		closed();
	}

	// 끝내기
	public void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.out.println(" 프로그램 종료");
			System.exit(0);
		} catch (Exception e) {
		}
	}

	public class MyCanvas extends Canvas {
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}

		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Ex03_Client cc = new Ex03_Client();
				cc.setVisible(true);
			}
		});
	}
}
