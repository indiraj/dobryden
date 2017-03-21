package com.dobryden.DAOIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dobryden.DAO.SellerDAO;
import com.dobryden.model.SellerReg;

@Repository
public class SellerDaoImpl implements SellerDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_Seller(SellerReg d) {
		System.out.println("w");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		System.out.println("e");
		s.save(d);
		t.commit();
		System.out.println("l");
		s.close();
		System.out.println("done");
		return false;
	}

}
