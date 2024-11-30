package com.jb.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("empDetails")
@Data
@ConfigurationProperties(prefix = "emp.jb")
public class EmployeeDetails {
	private String empId;
	private String empName;
	private String empDegn;
	private String empCompany;
	private double salary;

	private String[] friend;
	private String[] bike;
}
