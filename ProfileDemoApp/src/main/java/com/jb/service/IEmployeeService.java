package com.jb.service;

import com.jb.model.Employee;

import java.util.List;

public interface IEmployeeService {
	List<Employee> fetchEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception;

	String insertEmployee(Employee emp) throws Exception;
}
