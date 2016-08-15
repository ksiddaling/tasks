package com.shingu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.shingu.controller.ApplicationBean;
import com.shingu.model.Employee;
import com.shingu.model.EmployeeLogin;
import com.shingu.model.EmployeeLoginTimedetails;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("loginDaoImpl")
public class LoginDaoImpl extends MyHibernateDaoSupport implements LoginDao {

	public LoginDaoImpl() {
		super();
		System.out.println("loginDaoImpl constructor");
	}

	public SimpleDateFormat getDate() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}

	public String[] login(String name, String password) {
		System.out.println("logindao starts :" + name);

		Session session = null;
		List<EmployeeLogin> list = null;
		String[] aray = new String[2];
		try {
			session = getSession();

			String loginHql = "from EmployeeLogin where employeeLoginName='"
					+ name + "' and employeePassword='" + password + "'";
			System.out.println("loginHql is :" + loginHql);
			Query query = session.createQuery(loginHql);
			list = query.list();
			for (EmployeeLogin e : list) {
				aray[0] = Integer.toString(e.getEmployee().getEmployeeId());
			}
			aray[1] = null;
			System.out.println(list.size() + "," + aray[0]);

			if (!list.isEmpty()) {

				EmployeeLoginTimedetails employeeLoginTimedetails = new EmployeeLoginTimedetails();
				employeeLoginTimedetails.setEmployeeLogin(list.get(0));
				employeeLoginTimedetails.setEmployeeLoginTime(new Date());
				session.beginTransaction();
				session.save(employeeLoginTimedetails);
				session.getTransaction().commit();

				aray[1] = "home";
				return aray;
			}
			return aray;
		} finally {
			releaseSession(session);
		}
	}

	@Override
	public void logOut() {
		System.out.println("logout starts");

		Session session = null;
		EmployeeLoginTimedetails employeeLoginTimedetails = null;
		EmployeeLogin employeeLogin = null;
		try {
			session = getSession();
//			session.beginTransaction();
			Employee employee = (Employee) session
					.createCriteria(Employee.class)
					.add(Restrictions.eq("employeeId", Integer
							.parseInt(ApplicationBean.getUserIDFromSession())))
					.uniqueResult();

			Criteria criteria = session.createCriteria(EmployeeLogin.class)
					.add(Restrictions.eq("employee", employee));
			employeeLogin = (EmployeeLogin) criteria.uniqueResult();
			System.out.println(employeeLogin.getEmployeeLoginId());

			employeeLoginTimedetails = (EmployeeLoginTimedetails) session
					.createCriteria(EmployeeLoginTimedetails.class)
					.add(Restrictions.eq("employeeLogin", employeeLogin))
					.add(Restrictions.isNull("employeeLogoutTime"))
					.uniqueResult();
			System.out.println("employeeLoginTimedetails : "
					+ employeeLoginTimedetails);

			if (employeeLoginTimedetails != null) {
				session.beginTransaction();
				employeeLoginTimedetails.setEmployeeLogoutTime(new Date());
				session.saveOrUpdate(employeeLoginTimedetails);
				session.getTransaction().commit();
			}
		} finally {
			releaseSession(session);
		}

		System.out.println("logout ends");
	}
}
