package com.dobryden.DAOIMPL;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dobryden.DAO.CategoryDAO;
import com.dobryden.model.Category;


@Repository
public class CategoryDaoImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean insert_Category(Category d) {
		System.out.println("w");
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		s.save(d);
		t.commit();
		System.out.println("l");
		s.close();
		System.out.println("done");
		return false;
	}

}
