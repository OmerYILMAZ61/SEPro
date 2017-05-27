package com.sso.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sso.dao.DAO;
import com.sso.entity.Fiyatlar;
import com.sso.entity.MasaHesap;
import com.sso.entity.User;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;

public class AnaSayfa extends JFrame {

	private JPanel contentPane;
	private List<MasaHesap> masa1Hesap = DAO.getInstance().getMasaHesap(1);
	private List<MasaHesap> masa2Hesap = DAO.getInstance().getMasaHesap(2);
	private List<MasaHesap> masa3Hesap = DAO.getInstance().getMasaHesap(3);
	private List<MasaHesap> masa4Hesap = DAO.getInstance().getMasaHesap(4);
	private List<MasaHesap> masa5Hesap = DAO.getInstance().getMasaHesap(5);
	private List<MasaHesap> masa6Hesap = DAO.getInstance().getMasaHesap(6);
	private List<MasaHesap> masa7Hesap = DAO.getInstance().getMasaHesap(7);
	private List<MasaHesap> masa8Hesap = DAO.getInstance().getMasaHesap(8);
	private Hesap hesap1 = new Hesap(1,masa1Hesap);
	private Hesap hesap2 = new Hesap(2,masa2Hesap);
	private Hesap hesap3 = new Hesap(3,masa3Hesap);
	private Hesap hesap4 = new Hesap(4,masa4Hesap);
	private Hesap hesap5 = new Hesap(5,masa5Hesap);
	private Hesap hesap6 = new Hesap(6,masa6Hesap);
	private Hesap hesap7 = new Hesap(7,masa7Hesap);
	private Hesap hesap8 = new Hesap(8,masa8Hesap);
	JButton masa1, masa2, masa3, masa4, masa5, masa6, masa7, masa8;
	
	private User userK = Giris.getInstance().getUserG();

	static AnaSayfa uniqueInstance;
	private JButton btnk;
	static float kazanc;

	public static AnaSayfa getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new AnaSayfa();
		}
		return uniqueInstance;

	}

	/**
	 * Create the frame.
	 */
	public AnaSayfa() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 284);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		masa1 = new JButton("Masa 1");
		masa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				hesap1.setHesapList(masa1Hesap);
				hesap1.setMasaNo(1);
				hesap1.setVisible(true);
				
			}
		});
		
		if(masa1Hesap.size()<1){
		masa1.setBackground(Color.WHITE);
		}
		else{
			masa1.setBackground(Color.RED);
		}
		masa1.setForeground(Color.BLACK);

		masa2 = new JButton("Masa 2");
		masa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hesap2.setHesapList(masa2Hesap);
				hesap2.setMasaNo(2);
				hesap2.setVisible(true);

			}
		});
		if(masa2Hesap.size()<1){
			masa2.setBackground(Color.WHITE);
			}
			else{
				masa2.setBackground(Color.RED);
			}
		masa2.setForeground(Color.BLACK);

		masa3 = new JButton("Masa 3");
		masa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hesap3.setHesapList(masa3Hesap);
				hesap3.setMasaNo(3);
				hesap3.setVisible(true);

			}
		});
		if(masa3Hesap.size()<1){
			masa3.setBackground(Color.WHITE);
			}
			else{
				masa3.setBackground(Color.RED);
			}
		masa3.setForeground(Color.BLACK);

		masa4 = new JButton("Masa 4");
		masa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hesap4.setHesapList(masa4Hesap);
				hesap4.setMasaNo(4);
				hesap4.setVisible(true);

			}
		});
		if(masa4Hesap.size()<1){
			masa4.setBackground(Color.WHITE);
			}
			else{
				masa4.setBackground(Color.RED);
			}
		masa4.setForeground(Color.BLACK);

		masa5 = new JButton("Masa 5");
		masa5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap5.setHesapList(masa5Hesap);
				hesap5.setMasaNo(5);
				hesap5.setVisible(true);
			}
		});
		if(masa5Hesap.size()<1){
			masa5.setBackground(Color.WHITE);
			}
			else{
				masa5.setBackground(Color.RED);
			}
		masa5.setForeground(Color.BLACK);

		masa6 = new JButton("Masa 6");
		masa6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap6.setHesapList(masa6Hesap);
				hesap6.setMasaNo(6);
				hesap6.setVisible(true);
			}
		});
		if(masa6Hesap.size()<1){
			masa6.setBackground(Color.WHITE);
			}
			else{
				masa6.setBackground(Color.RED);
			}
		masa6.setForeground(Color.BLACK);

		masa7 = new JButton("Masa 7");
		masa7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap7.setHesapList(masa7Hesap);
				hesap7.setMasaNo(7);
				hesap7.setVisible(true);
			}
		});
		if(masa7Hesap.size()<1){
			masa7.setBackground(Color.WHITE);
			}
			else{
				masa7.setBackground(Color.RED);
			}
		masa7.setForeground(Color.BLACK);

		masa8 = new JButton("Masa 8");
		masa8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap8.setHesapList(masa8Hesap);
				hesap8.setMasaNo(8);
				hesap8.setVisible(true);
			}
		});
		if(masa8Hesap.size()<1){
			masa8.setBackground(Color.WHITE);
			}
			else{
				masa8.setBackground(Color.RED);
			}
		masa8.setForeground(Color.BLACK);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		
		btnk = new JButton("\u00C7\u0131k");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				userK = null;
				Giris.getInstance().setVisible(true);
				
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(masa1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(masa3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(masa5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(masa7, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(masa8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(332, Short.MAX_VALUE)
					.addComponent(btnk))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(masa1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(masa5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa7, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addComponent(btnk))
		);
		
		panel_1.setLayout(new CardLayout(0, 0));
		
		System.out.println(userK.getName());
		System.out.println(userK.getYetki());
		
		
		if(userK.getYetki()==1){
		JTextArea textArea = new JTextArea();
		panel_1.add(textArea, "name_39884557800631");
	
		panel.setLayout(new CardLayout(0, 0));
	
	
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textArea.setText(String.valueOf(AnaSayfa.kazanc));	
			}
		});
		panel.add(btnHesapla, "name_39839831611297");
		}
		contentPane.setLayout(gl_contentPane);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public List<MasaHesap> getMasa1Hesap() {
		return masa1Hesap;
	}

	public void setMasa1Hesap(List<MasaHesap> masa1Hesap) {
		this.masa1Hesap = masa1Hesap;
	}

	public List<MasaHesap> getMasa2Hesap() {
		return masa2Hesap;
	}

	public void setMasa2Hesap(List<MasaHesap> masa2Hesap) {
		this.masa2Hesap = masa2Hesap;
	}

	public List<MasaHesap> getMasa3Hesap() {
		return masa3Hesap;
	}

	public void setMasa3Hesap(List<MasaHesap> masa3Hesap) {
		this.masa3Hesap = masa3Hesap;
	}

	public List<MasaHesap> getMasa4Hesap() {
		return masa4Hesap;
	}

	public void setMasa4Hesap(List<MasaHesap> masa4Hesap) {
		this.masa4Hesap = masa4Hesap;
	}

	public List<MasaHesap> getMasa5Hesap() {
		return masa5Hesap;
	}

	public void setMasa5Hesap(List<MasaHesap> masa5Hesap) {
		this.masa5Hesap = masa5Hesap;
	}

	public List<MasaHesap> getMasa6Hesap() {
		return masa6Hesap;
	}

	public void setMasa6Hesap(List<MasaHesap> masa6Hesap) {
		this.masa6Hesap = masa6Hesap;
	}

	public List<MasaHesap> getMasa7Hesap() {
		return masa7Hesap;
	}

	public void setMasa7Hesap(List<MasaHesap> masa7Hesap) {
		this.masa7Hesap = masa7Hesap;
	}

	public List<MasaHesap> getMasa8Hesap() {
		return masa8Hesap;
	}

	public void setMasa8Hesap(List<MasaHesap> masa8Hesap) {
		this.masa8Hesap = masa8Hesap;
	}

	public User getUserK() {
		return userK;
	}

	public void setUserK(User userK) {
		this.userK = userK;
	}
}