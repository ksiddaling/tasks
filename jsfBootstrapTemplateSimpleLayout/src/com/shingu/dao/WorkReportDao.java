package com.shingu.dao;

import java.util.List;

import com.shingu.model.DayWork;

public interface WorkReportDao {
	public String addWorkReport(String workReport);
	public List<DayWork> getUserDayWork();
}
