package com.shingu.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the status database table.
 * 
 */
@Entity
@NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private int statusId;

	@Column(name = "status_name")
	private String statusName;

	// bi-directional many-to-one association to Employee
	@OneToMany(mappedBy = "status")
	private List<Employee> employees;

	// bi-directional many-to-one association to EmployeeLogin
	@OneToMany(mappedBy = "status1")
	private List<EmployeeLogin> employeeLogins1;

	// bi-directional many-to-one association to EmployeeLogin
	@OneToMany(mappedBy = "status2")
	private List<EmployeeLogin> employeeLogins2;

	// bi-directional many-to-one association to Task
	@OneToMany(mappedBy = "status")
	private List<Task> tasks;

	public Status() {
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setStatus(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setStatus(null);

		return employee;
	}

	public List<EmployeeLogin> getEmployeeLogins1() {
		return this.employeeLogins1;
	}

	public void setEmployeeLogins1(List<EmployeeLogin> employeeLogins1) {
		this.employeeLogins1 = employeeLogins1;
	}

	public EmployeeLogin addEmployeeLogins1(EmployeeLogin employeeLogins1) {
		getEmployeeLogins1().add(employeeLogins1);
		employeeLogins1.setStatus1(this);

		return employeeLogins1;
	}

	public EmployeeLogin removeEmployeeLogins1(EmployeeLogin employeeLogins1) {
		getEmployeeLogins1().remove(employeeLogins1);
		employeeLogins1.setStatus1(null);

		return employeeLogins1;
	}

	public List<EmployeeLogin> getEmployeeLogins2() {
		return this.employeeLogins2;
	}

	public void setEmployeeLogins2(List<EmployeeLogin> employeeLogins2) {
		this.employeeLogins2 = employeeLogins2;
	}

	public EmployeeLogin addEmployeeLogins2(EmployeeLogin employeeLogins2) {
		getEmployeeLogins2().add(employeeLogins2);
		employeeLogins2.setStatus2(this);

		return employeeLogins2;
	}

	public EmployeeLogin removeEmployeeLogins2(EmployeeLogin employeeLogins2) {
		getEmployeeLogins2().remove(employeeLogins2);
		employeeLogins2.setStatus2(null);

		return employeeLogins2;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setStatus(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setStatus(null);

		return task;
	}

	public Status(String statusName) {
		super();
		this.statusName = statusName;
	}

	public Status(int statusId, String statusName) {
		super();
		this.statusId = statusId;
		this.statusName = statusName;
	}

}