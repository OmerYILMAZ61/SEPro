package com.sso.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fiyatlar {

	@Id
	private int id;
	private String yemek;
	private float fiyat;

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

}
