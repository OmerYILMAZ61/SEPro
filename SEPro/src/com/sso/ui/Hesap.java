package com.sso.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sso.dao.DAO;
import com.sso.entity.Fiyatlar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Hesap extends JFrame {

	private List<Fiyatlar> hesapList = new ArrayList<>();
	private JPanel contentPane;
	private JTable table;
	private JButton btnEkle;
	private JComboBox comboBox;
	private JButton btnGeri;
	JTextArea hesaplaArea;
	private JButton btnde;
	private int masaNo;


	/**
	 * Create the frame.
	 */
	public Hesap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		
		table = new JTable();
		
			String[] columns = { "yemek", "fiyat", };

			String[][] rows = new String[hesapList.size()][2];

			for (int i = 0; i < hesapList.size(); i++) {
				rows[i][0] = hesapList.get(i).getYemek();
				rows[i][1] = String.valueOf(hesapList.get(i).getFiyat());

			}

			TableModel dataModel = new DefaultTableModel(rows, columns);
			table.setModel(dataModel);
	
		comboBox = new JComboBox();
		List<Fiyatlar> listF = DAO.getInstance().fiyatListele();
		for (int i = 0; i < listF.size(); i++) {
			comboBox.addItem(listF.get(i).getYemek());
		}

		btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Fiyatlar yemek = yemekFiyatiBul((String) comboBox.getSelectedItem());

				hesapList.add(yemek);


				String[] columns = { "yemek", "fiyat", };

				String[][] rows = new String[hesapList.size()][2];

				for (int i = 0; i < hesapList.size(); i++) {
					rows[i][0] = hesapList.get(i).getYemek();
					rows[i][1] = String.valueOf(hesapList.get(i).getFiyat());

				}

				TableModel dataModel = new DefaultTableModel(rows, columns);
				table.setModel(dataModel);
				hesaplaArea.setText("Hesabýnýz = " + hesapla());

			}

			private Fiyatlar yemekFiyatiBul(String object) {
				for (int i = 0; i < listF.size(); i++) {

					if (listF.get(i).getYemek().equals(object))
						return listF.get(i);

				}
				return null;
			}
		});

		btnGeri = new JButton("Geri");
		btnGeri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
				
				if(masaNo == 1 ){
					AnaSayfa.getInstance().setMasa1Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa1.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa1.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
					
				}else if (masaNo==2) {
					AnaSayfa.getInstance().setMasa2Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa2.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa2.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
				else if (masaNo==3) {
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa3.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa3.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
					AnaSayfa.getInstance().setMasa3Hesap(hesapList);
					
				}
				else if (masaNo==4) {
					AnaSayfa.getInstance().setMasa4Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa4.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa4.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
				else if (masaNo==5) {
					AnaSayfa.getInstance().setMasa5Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa5.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa5.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
				else if (masaNo==6) {
					AnaSayfa.getInstance().setMasa6Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa6.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa6.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
				else if (masaNo==7) {
					AnaSayfa.getInstance().setMasa7Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa7.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa7.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
				else if (masaNo==8) {
					AnaSayfa.getInstance().setMasa8Hesap(hesapList);
					if (hesapList.size()<1) {
						AnaSayfa.getInstance().masa8.setBackground(Color.WHITE);
					}else{
						AnaSayfa.getInstance().masa8.setBackground(Color.RED);
					}
					AnaSayfa.getInstance().setVisible(true);
				}
			
				
			}
		});

		hesaplaArea = new JTextArea();
		hesaplaArea.setText("Hesabýnýz = " + hesapla());

		btnde = new JButton("\u00D6de");
		btnde.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < hesapList.size(); i++) {
					AnaSayfa.kazanc+=hesapList.get(i).getFiyat();
				}
				
				hesapList.clear();
				
				String[] columns = { "yemek", "fiyat", };

				String[][] rows = new String[hesapList.size()][2];

				for (int i = 0; i < hesapList.size(); i++) {
					rows[i][0] = hesapList.get(i).getYemek();
					rows[i][1] = String.valueOf(hesapList.get(i).getFiyat());

				}

				TableModel dataModel = new DefaultTableModel(rows, columns);
				table.setModel(dataModel);
				
				hesaplaArea.setText("Hesabýnýz = " + hesapla());

			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(31)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false).addComponent(hesaplaArea)
						.addComponent(table, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnEkle)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnGeri))
						.addComponent(btnde))
				.addContainerGap(95, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(31)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnEkle).addComponent(btnGeri)))
								.addComponent(table, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(btnde)
								.addComponent(hesaplaArea, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))));
		contentPane.setLayout(gl_contentPane);
	}

	private float hesapla() {
		float sonuc = 0;
		for (int i = 0; i < hesapList.size(); i++) {
			sonuc += hesapList.get(i).getFiyat();
		}
		return sonuc;
	}

	public List<Fiyatlar> getHesapList() {
		return hesapList;
	}

	public void setHesapList(List<Fiyatlar> hesapList) {
		this.hesapList = hesapList;
	}

	public int getMasaNo() {
		return masaNo;
	}

	public void setMasaNo(int masaNo) {
		this.masaNo = masaNo;
	}

}
