package com.sso.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MasaHesap {
	
	@Id
	@GeneratedValue
	private int id;
	
	private int masaNo;	
	
	private String yemek;

	private float fiyat;
	
	public int getMasaNo() {
		return masaNo;
	}
	public void setMasaNo(int masaNo) {
		this.masaNo = masaNo;
	}
	public String getYemek() {
		return yemek;
	}
	public void setYemek(String yemek) {
		this.yemek = yemek;
	}
	public float getFiyat() {
		return fiyat;
	}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
