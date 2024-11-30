package com.jb.dao;

import com.jb.model.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception;

    int insertEmployee(Employee emp) throws Exception;
}
