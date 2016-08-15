package com.shingu.dao;

import java.util.List; 

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.model.DayWork;
import com.shingu.model.Employee;
import com.shingu.model.EmployeeLogin;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("workReportDaoImpl")
public class WorkReportDaoImpl extends MyHibernateDaoSupport implements
		WorkReportDao {

	@Override
	public String addWorkReport(String workReport) {
		System.out.println("addWorkReport starts");
		Session theSession = null;
		Transaction tx = null;
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession httpSession = (HttpSession) context.getExternalContext()
				.getSession(false);
		int loginid = Integer.parseInt((String) httpSession
				.getAttribute("userid"));
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			System.out.println("addwordreport userid is : " + loginid);
			DayWork dayWork = new DayWork();
			dayWork.setDayWork(workReport);
			Employee employee = new Employee();
			employee.setEmployeeId(loginid);
			dayWork.setEmployee(employee);

			theSession.save(dayWork);
			tx.commit();
		} /*
		 * catch (Exception exception) { System.out.println(exception); return
		 * null; }
		 */finally {
			releaseSession(theSession);
		}
		System.out.println("addWorkReport ends");
		return "viewWorkReport";
	}

	@Override
	public List<DayWork> getUserDayWork() {
		System.out.println(" getUserDayWork() impl starts");
		Session theSession = null;
		Transaction tx = null;
		List<DayWork> dayWorks=null;
		FacesContext context = FacesContext.getCurrentInstance();
		HttpSession httpSession = (HttpSession) context.getExternalContext()
				.getSession(false);
		int loginid = Integer.parseInt((String) httpSession
				.getAttribute("userid"));
		try {
			theSession = getSession();
			theSession
					.createQuery("from DayWork d where d.getEmployee().getEmployeeId()="
							+ loginid);
		} finally {
			releaseSession(theSession);
		}
		System.out.println("addWorkReport ends");
		return dayWorks;
	}
}
