package com.shingu.service;

import java.util.List;

import com.shingu.model.DayWork;

public interface WorkReportService {

	public String addWorkReport(String workReport);
	public List<DayWork> getUserDayWork();

}
