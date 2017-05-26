package com.sso.ui;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.sso.dao.DAO;
import com.sso.entity.User;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Giris extends JFrame {

	
	private JPanel contentPane;
	private JTextField adText;
	private JPasswordField sifreText;
	private User userG = null;

	static Giris uniqueInstance;

	public static Giris getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Giris();
		}
		return uniqueInstance;

	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Giris.getInstance().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Giris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 184);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAd = new JLabel("Kullan\u0131c\u0131");
		
		JLabel lblSoyad = new JLabel("\u015Eifre");
		
		adText = new JTextField();
		adText.setColumns(10);
		
		sifreText = new JPasswordField();
		sifreText.setColumns(10);
		
		JButton girisButton = new JButton("Giris");
		girisButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				User user = new User();
				user.setName(adText.getText());
				user.setPass(sifreText.getText());
				Giris.getInstance().userG= DAO.getInstance().kontrolEt(user);
				
				if(Giris.getInstance().userG!=null){
					AnaSayfa.getInstance().setUserK(userG);
					
					AnaSayfa anaSayfa = new AnaSayfa();
					AnaSayfa.uniqueInstance = anaSayfa;
					anaSayfa.setVisible(true);
					Giris.getInstance().setVisible(false);
				}
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(girisButton)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAd)
								.addComponent(lblSoyad))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(adText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(sifreText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(243, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAd)
						.addComponent(adText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSoyad)
						.addComponent(sifreText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(girisButton)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public User getUserG() {
		return userG;
	}

	public void setUserG(User userG) {
		this.userG = userG;
	}
	
	
}
