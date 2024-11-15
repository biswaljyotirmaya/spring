package com.jb.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.DAO.IEmployeeDAO;
import com.jb.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO empdao;

	@Override
	public List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {

		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();

		List<Employee> list = empdao.getEmployeeByDesgn(desg1, desg2, desg3);
		list.sort((Employee emp1, Employee emp2) -> emp1.getEname().compareTo(emp2.getEname()));
//		list.sort(Comparator.comparing(Employee::getEname));

		list.forEach(emp -> {
			emp.setGrossSalary(emp.getSalary() + (emp.getSalary() * 0.5));
			emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
		});
		return list;
	}

	@Override
	public String insertEmployee(Employee emp) throws Exception {
		int rowCount = empdao.insertEmployee(emp);
		return rowCount == 0 ? "Employee not registered!" : "Employee registered successfully!";
	}
}
