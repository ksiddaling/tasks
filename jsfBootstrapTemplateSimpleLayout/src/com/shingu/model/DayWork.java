package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the day_work database table.
 * 
 */
@Entity
@Table(name="day_work")
@NamedQuery(name="DayWork.findAll", query="SELECT d FROM DayWork d")
public class DayWork implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="day_work_id")
	private int dayWorkId;

	@Column(name="day_work")
	private String dayWork;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	public DayWork() {
	}

	public int getDayWorkId() {
		return this.dayWorkId;
	}

	public void setDayWorkId(int dayWorkId) {
		this.dayWorkId = dayWorkId;
	}

	public String getDayWork() {
		return this.dayWork;
	}

	public void setDayWork(String dayWork) {
		this.dayWork = dayWork;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}