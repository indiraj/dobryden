package com.dobryden.DAOIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dobryden.DAO.ProductDAO;
import com.dobryden.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_product(Product p) {
		// TODO Auto-generated method stub
		System.out.println("w");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		System.out.println("e");
		s.save(p);
		t.commit();
		System.out.println("l");
		s.close();
		System.out.println("done");
		return false;
	}

}
