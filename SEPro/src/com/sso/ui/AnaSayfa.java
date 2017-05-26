package com.sso.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sso.entity.Fiyatlar;

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

public class AnaSayfa extends JFrame {

	private JPanel contentPane;
	private List<Fiyatlar> masa1Hesap = new ArrayList<>();
	private List<Fiyatlar> masa2Hesap = new ArrayList<>();
	private List<Fiyatlar> masa3Hesap = new ArrayList<>();
	private List<Fiyatlar> masa4Hesap = new ArrayList<>();
	private List<Fiyatlar> masa5Hesap = new ArrayList<>();
	private List<Fiyatlar> masa6Hesap = new ArrayList<>();
	private List<Fiyatlar> masa7Hesap = new ArrayList<>();
	private List<Fiyatlar> masa8Hesap = new ArrayList<>();
	private Hesap hesap1 = new Hesap();
	private Hesap hesap2 = new Hesap();
	private Hesap hesap3 = new Hesap();
	private Hesap hesap4 = new Hesap();
	private Hesap hesap5 = new Hesap();
	private Hesap hesap6 = new Hesap();
	private Hesap hesap7 = new Hesap();
	private Hesap hesap8 = new Hesap();
    JButton masa1,masa2,masa3,masa4,masa5,masa6,masa7,masa8;

	static AnaSayfa uniqueInstance;

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
		setBounds(100, 100, 447, 160);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		masa1 = new JButton("Masa 1");
		masa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hesap1.setMasaNo(1);
				hesap1.setVisible(true);
				hesap1.setHesapList(masa1Hesap);

			}
		});
		masa1.setBackground(Color.WHITE);
		masa1.setForeground(Color.BLACK);

		masa2 = new JButton("Masa 2");
		masa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hesap2.setHesapList(masa2Hesap);
				hesap2.setMasaNo(2);
				hesap2.setVisible(true);

			}
		});
		masa2.setBackground(Color.WHITE);
		masa2.setForeground(Color.BLACK);

		masa3 = new JButton("Masa 3");
		masa3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hesap3.setHesapList(masa3Hesap);
				hesap3.setMasaNo(3);
				hesap3.setVisible(true);

			}
		});
		masa3.setBackground(Color.WHITE);
		masa3.setForeground(Color.BLACK);
		

		masa4 = new JButton("Masa 4");
		masa4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				hesap4.setHesapList(masa4Hesap);
				hesap4.setMasaNo(4);
				hesap4.setVisible(true);

			}
		});
		masa4.setBackground(Color.WHITE);
		masa4.setForeground(Color.BLACK);
		

		masa5 = new JButton("Masa 5");
		masa5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap5.setHesapList(masa5Hesap);
				hesap5.setMasaNo(5);
				hesap5.setVisible(true);
			}
		});
		masa5.setBackground(Color.WHITE);
		masa5.setForeground(Color.BLACK);

		masa6 = new JButton("Masa 6");
		masa6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap6.setHesapList(masa6Hesap);
				hesap6.setMasaNo(6);
				hesap6.setVisible(true);
			}
		});
		masa6.setBackground(Color.WHITE);
		masa6.setForeground(Color.BLACK);
		

		masa7 = new JButton("Masa 7");
		masa7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap7.setHesapList(masa7Hesap);
				hesap7.setMasaNo(7);
				hesap7.setVisible(true);
			}
		});
		masa7.setBackground(Color.WHITE);
		masa7.setForeground(Color.BLACK);
		

		masa8 = new JButton("Masa 8");
		masa8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hesap8.setHesapList(masa8Hesap);
				hesap8.setMasaNo(8);
				hesap8.setVisible(true);
			}
		});
		masa8.setBackground(Color.WHITE);
		masa8.setForeground(Color.BLACK);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(masa1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa3, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa4, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(masa5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa6, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa7, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(masa8, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(4)))
					.addContainerGap(125, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(masa1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addComponent(masa2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
						.addComponent(masa3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(masa5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa6, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa7, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(masa8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
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

	public List<Fiyatlar> getMasa1Hesap() {
		return masa1Hesap;
	}

	public void setMasa1Hesap(List<Fiyatlar> masa1Hesap) {
		this.masa1Hesap = masa1Hesap;
	}

	public List<Fiyatlar> getMasa2Hesap() {
		return masa2Hesap;
	}

	public void setMasa2Hesap(List<Fiyatlar> masa2Hesap) {
		this.masa2Hesap = masa2Hesap;
	}

	public List<Fiyatlar> getMasa3Hesap() {
		return masa3Hesap;
	}

	public void setMasa3Hesap(List<Fiyatlar> masa3Hesap) {
		this.masa3Hesap = masa3Hesap;
	}

	public List<Fiyatlar> getMasa4Hesap() {
		return masa4Hesap;
	}

	public void setMasa4Hesap(List<Fiyatlar> masa4Hesap) {
		this.masa4Hesap = masa4Hesap;
	}

	public List<Fiyatlar> getMasa5Hesap() {
		return masa5Hesap;
	}

	public void setMasa5Hesap(List<Fiyatlar> masa5Hesap) {
		this.masa5Hesap = masa5Hesap;
	}

	public List<Fiyatlar> getMasa6Hesap() {
		return masa6Hesap;
	}

	public void setMasa6Hesap(List<Fiyatlar> masa6Hesap) {
		this.masa6Hesap = masa6Hesap;
	}

	public List<Fiyatlar> getMasa7Hesap() {
		return masa7Hesap;
	}

	public void setMasa7Hesap(List<Fiyatlar> masa7Hesap) {
		this.masa7Hesap = masa7Hesap;
	}

	public List<Fiyatlar> getMasa8Hesap() {
		return masa8Hesap;
	}

	public void setMasa8Hesap(List<Fiyatlar> masa8Hesap) {
		this.masa8Hesap = masa8Hesap;
	}

}
