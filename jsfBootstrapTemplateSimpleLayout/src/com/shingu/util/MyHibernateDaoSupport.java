package com.shingu.util;

import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class MyHibernateDaoSupport extends HibernateDaoSupport {

	@Autowired
	public void mySetSessionFactory(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
}
