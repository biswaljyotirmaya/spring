package com.jb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jb.model.Employee;

@Repository("empDAO")
public class EmployeeDAOimpl implements IEmployeeDAO {
	private static final String GET_EMPS_QUERY = "SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	private static final String INSERT_NEW_EMP = "INSERT INTO EMP (EMPNO,ENAME,JOB,SAL,DEPTNO) VALUES(empno_seq.nextval,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = new ArrayList<Employee>();
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					list.add(emp);
				}
			}
		} catch (SQLException se) {
//			se.printStackTrace();
			throw se;
		} catch (Exception e) {
//			e.printStackTrace();
			throw e;
		}
		return list;
	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		int rowCount = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_NEW_EMP);) {
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getJob());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());
			rowCount = ps.executeUpdate();
		}
		return rowCount;
	}
}
