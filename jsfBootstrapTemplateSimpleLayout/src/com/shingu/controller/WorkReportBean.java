package com.shingu.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shingu.model.DayWork;
import com.shingu.service.WorkReportService;

@Component
@ManagedBean(name = "workReportBean")
@Scope("request")
public class WorkReportBean implements Serializable {

	private static final long serialVersionUID = 4231233787198249658L;

	@Autowired
	private WorkReportService workReportService;
	private String workReport;
	private List<DayWork> dayWork;

	public WorkReportService getWorkReportService() {
		return workReportService;
	}

	public void setWorkReportService(WorkReportService workReportService) {
		this.workReportService = workReportService;
	}

	public String getWorkReport() {
		return workReport;
	}

	public void setWorkReport(String workReport) {
		this.workReport = workReport;
	}

	public List<DayWork> getDayWork() {
		return dayWork;
	}

	public void setDayWork(List<DayWork> dayWork) {
		this.dayWork = dayWork;
	}

	@Override
	public String toString() {
		return "WorkReportBean [workReportService=" + workReportService
				+ ", workReport=" + workReport + "]";
	}

	public String addWorkReport() {
		System.out.println("WorkReportBean addWorkReport() starts");
		String result = workReportService.addWorkReport(workReport);
		System.out
				.println("WorkReportBean addWorkReport() ends plus result is : "
						+ result);
		return result;
	}

	public String getUserDayWork() {
		
		return "viewWorkReport";
	}
}
