package com.shingu.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.shingu.dto.DesignationDto;
import com.shingu.dto.EmployeeDto;
import com.shingu.model.Designation;
import com.shingu.model.Employee;
import com.shingu.model.EmployeeAddress;
import com.shingu.model.EmployeePhone;
import com.shingu.util.MyHibernateDaoSupport;

@Repository("userDaoImpl")
public class UserDaoImpl extends MyHibernateDaoSupport implements UserDao {

	@Override
	public void createUser(Employee employee) {
		System.out.println("createUserDao starts");
		Session theSession = null;
		Transaction tx = null;
		try {
			theSession = getSession();
			tx = theSession.getTransaction();
			tx.begin();
			theSession.saveOrUpdate(employee);
			tx.commit();
		} finally {
			releaseSession(theSession);
		}
		System.out.println("createUserDao ends");
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		Session session = null;
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		EmployeeDto employeeDto = null;
		try {
			session = getSession();
			Query query = session.createQuery("from Employee");
			List<Employee> employees = query.list();
			System.out.println(employees.size());
			for (Employee u : employees) {
				System.out
						.println(u.getEmployeeId() + " , " + u.getFirstName());
				employeeDto = new EmployeeDto();
				employeeDto.setEmployeeId(u.getEmployeeId());
				employeeDto.setFirstName(u.getFirstName());
				employeeDto.setDesignation(u.getDesignation());
				employeeDto.setRole(u.getRole());
				employeeDto.setGender(u.getGender());
				employeeDto.setStatus(u.getStatus());
				for (EmployeeAddress state : u.getEmployeeAddresses()) {
					employeeDto.setState(state.getState());
				}
				for (EmployeePhone phone : u.getEmployeePhones()) {
					employeeDto.setPhone(phone.getPhone());
				}
				employeeDtos.add(employeeDto);
			}
		} finally {
			releaseSession(session);
		}
		return employeeDtos;
	}

	@Override
	public List<EmployeeDto> searchEmployee(String name) {
		Session session = null;
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		EmployeeDto employeeDto = null;
		String hql = "from Employee e where e.firstName like '" + name + "%'";
		System.out.println("query......" + hql);
		try {
			session = getSession();
			Query query = session.createQuery(hql);
			List<Employee> employees = query.list();
			System.out.println(employees.size());
			for (Employee u : employees) {
				System.out
						.println(u.getEmployeeId() + " , " + u.getFirstName());
				employeeDto = new EmployeeDto();
				employeeDto.setEmployeeId(u.getEmployeeId());
				employeeDto.setFirstName(u.getFirstName());
				employeeDto.setDesignation(u.getDesignation());
				employeeDto.setRole(u.getRole());
				employeeDto.setGender(u.getGender());
				employeeDto.setStatus(u.getStatus());
				for (EmployeeAddress state : u.getEmployeeAddresses()) {
					employeeDto.setState(state.getState());
				}
				for (EmployeePhone phone : u.getEmployeePhones()) {
					employeeDto.setPhone(phone.getPhone());
				}
				employeeDtos.add(employeeDto);
			}
		} finally {
			releaseSession(session);
		}
		return employeeDtos;
	}
}
