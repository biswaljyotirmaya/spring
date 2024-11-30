package com.jb.service;

import com.jb.dao.IEmployeeDAO;
import com.jb.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO employeeDAO;

	@Override
	public List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		return employeeDAO.getEmployeeByDesgn(desg1, desg2, desg3);
	}

	@Override
	public String insertEmployee(Employee emp) throws Exception {
		int count = employeeDAO.insertEmployee(emp);
		return count > 0 ? "Employee inserted successfully!" : "Failed to insert employee.";
	}
}
