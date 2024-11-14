package com.jb.service;

import java.util.List;

import com.jb.model.Employee;

public interface IEmployeeService {
	public List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception;

	public String insertEmployee(Employee emp) throws Exception;
}
