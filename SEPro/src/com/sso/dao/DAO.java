package com.sso.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sso.dao.DAO;
import com.sso.entity.Fiyatlar;
import com.sso.entity.MasaHesap;
import com.sso.entity.User;

public class DAO {
	
	static DAO uniqueInstance;
	MasaHesap Mfiyatlar;
	
	public static DAO getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new DAO();
		}
		return uniqueInstance;
		
	}
	SessionFactory sessionFactory;
	
	public DAO() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	
	
	
	public void add(Object obj){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();
			
		} catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
		
	}



	public User kontrolEt(User user) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("name", user.getName()));
		criteria.add(Restrictions.eq("pass", user.getPass()));
		
		if(criteria.list().size()>0){
			return (User) criteria.list().get(0);
		}
		return null;
	}
	
	public List<Fiyatlar> fiyatListele(){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Fiyatlar.class);
		
		List<Fiyatlar> list = criteria.list();
		
		return list;
		
	}



	public List<MasaHesap> getMasaHesap(int i) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(MasaHesap.class);
		List<MasaHesap> list = new ArrayList<>();
		List<MasaHesap> listMasa = criteria.list();
		for (int j = 0; j < listMasa.size(); j++) {
			if(listMasa.get(j).getMasaNo()==i){
				Mfiyatlar = new MasaHesap();
				Mfiyatlar.setFiyat(listMasa.get(j).getFiyat());
				Mfiyatlar.setYemek(listMasa.get(j).getYemek());
				Mfiyatlar.setId(listMasa.get(j).getId());
				list.add(Mfiyatlar);
			}
		}
		
		return list;
	}



	public void ode(MasaHesap masaHesap) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			
				tx = session.beginTransaction();
				session.delete(masaHesap);;
				tx.commit();
			
			
		} catch (Exception e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}

	
}
