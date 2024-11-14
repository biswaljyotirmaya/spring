package com.jb.DAO;

import java.util.List;

import com.jb.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception;

	public int insertEmployee(Employee emp) throws Exception;
}
