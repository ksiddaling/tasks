package com.shingu.service;

import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shingu.dao.WorkReportDao;
import com.shingu.model.DayWork;
import com.shingu.model.Employee;

@Service
public class WorkReportServiceImpl implements WorkReportService {

	@Autowired
	WorkReportDao workReportDao;

	public WorkReportDao getWorkReportDao() {
		return workReportDao;
	}

	public void setWorkReportDao(WorkReportDao workReportDao) {
		this.workReportDao = workReportDao;
	}

	@Override
	public String addWorkReport(String workReport) {
		System.out.println("addworkreportservice starts and workReport is :"
				+ workReport);

		String result = workReportDao.addWorkReport(workReport);

		System.out.println("result : " + result);
		System.out.println("addworkreportservice ends");
		return result;
	}

	@Override
	public List<DayWork> getUserDayWork() {
		// TODO Auto-generated method stub
		return null;
	}

}
