package com.shingu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.shingu.controller.ApplicationBean;
import com.shingu.dto.EmployeeAttendanceDto;
import com.shingu.model.Employee;
import com.shingu.model.EmployeeAttendance;
import com.shingu.model.EmployeeLogin;
import com.shingu.model.EmployeeLoginTimedetails;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("attendanceDaoImpl")
public class AttendanceDaoImpl extends MyHibernateDaoSupport implements
		AttendanceDao {

	boolean doIt = true;

	public SimpleDateFormat getDate() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}

	@Override
	public boolean attendanceLogin(String userid) {
		System.out.println("attendanceLogin(LoginTime) starts");

		Session session = null;
		EmployeeAttendance employeeAttendanceSave = null;
		EmployeeLogin employeeLogin = null;
		try {
			session = getSession();
			session.beginTransaction();

			Employee employee = (Employee) session
					.createCriteria(Employee.class)
					.add(Restrictions.eq("employeeId", Integer.parseInt(userid)))
					.uniqueResult();

			List<EmployeeAttendance> employeeAttendances = session
					.createCriteria(EmployeeAttendance.class)
					.add(Restrictions.eq("employee", employee)).list();

			for (EmployeeAttendance employeeAttendance : employeeAttendances) {

				if (getDate().format(
						employeeAttendance.getEmployeeAttendanceLoginTime())
						.compareTo(getDate().format(new Date())) != 0) {
					doIt = true;
					System.out.println("else if");
				} else if (getDate().format(
						employeeAttendance.getEmployeeAttendanceLoginTime())
						.equals(getDate().format(new Date()))) {

					System.out.println("\n get my date.com :"
							+ getDate().format(new Date())
							+ " and current new Date() is : "
							+ getDate().format(
									employeeAttendance
											.getEmployeeAttendanceLoginTime()));
					doIt = false;

				}
			}
			if (doIt == true) {
				employeeAttendanceSave = new EmployeeAttendance();
				employeeAttendanceSave.setEmployee(employee);
				employeeAttendanceSave
						.setEmployeeAttendanceLoginTime(new Date());
				System.out.println("employeeLoginTime is : "
						+ employeeAttendanceSave
								.getEmployeeAttendanceLoginTime());
				session.save(employeeAttendanceSave);
				session.getTransaction().commit();
			}

		} finally {
			releaseSession(session);
		}

		System.out.println("attendanceLogin(LoginTime) ends");
		return true;
	}

	@Override
	public boolean attendanceLogout(String userid) {
		System.out.println("attendanceLogout(LogoutTime) starts");

		Session session = null;
		EmployeeAttendance employeeAttendance = null;
		try {
			session = getSession();
			session.beginTransaction();
			Employee employee = (Employee) session
					.createCriteria(Employee.class)
					.add(Restrictions.eq("employeeId", Integer.parseInt(userid)))
					.uniqueResult();

			employeeAttendance = (EmployeeAttendance) session
					.createCriteria(EmployeeAttendance.class)
					.add(Restrictions.eq("employee", employee))
					.add(Restrictions.isNull("employeeAttendanceLogoutTime"))
					.uniqueResult();
			System.out.println("employeeLoginTimedetails : "
					+ employeeAttendance);

			if (employeeAttendance != null) {
				session.beginTransaction();
				employeeAttendance.setEmployeeAttendanceLogoutTime(new Date());
				session.saveOrUpdate(employeeAttendance);
				session.getTransaction().commit();
			}
		} finally {
			releaseSession(session);
		}

		System.out.println("attendanceLogout(LoginTime) ends");
		return false;
	}

	public List<EmployeeAttendance> attendanceList() {
		Session session = null;
		List<EmployeeAttendance> employeeAttendances = null;
		try {
			session = getSession();
			Employee employee = (Employee) session
					.createCriteria(Employee.class)
					.add(Restrictions.eq("employeeId", Integer
							.parseInt(ApplicationBean.getUserIDFromSession())))
					.uniqueResult();
			employeeAttendances = session
					.createCriteria(EmployeeAttendance.class)
					.add(Restrictions.eq("employee", employee)).list();
			for (EmployeeAttendance employeeAttendance : employeeAttendances) {
				System.out.println(employeeAttendance.toString());
			}
		} finally {
			releaseSession(session);
		}

		return employeeAttendances;
	}
}
