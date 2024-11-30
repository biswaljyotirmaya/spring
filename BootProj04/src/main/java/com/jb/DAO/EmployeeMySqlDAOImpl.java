package com.jb.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jb.model.Employee;

@Repository("MySqlDAO")
public class EmployeeMySqlDAOImpl implements IEmployeeDAO {

	private static final String GET_EMP_BY_DEGN = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)";
	private static final String INSERT_EMPLOYE = "INSERT INTO EMP(ENAME, JOB, SAL, DEPTNO) VALUES(?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = null;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DEGN);) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			try (ResultSet rs = ps.executeQuery();) {
				list = new ArrayList<>();
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
		}
		return list;
	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		int result = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYE)) {
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getJob());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getDeptno());

			result = ps.executeUpdate();
		} catch (SQLException se) {
//			se.printStackTrace();
			throw se;
		} catch (Exception e) {
//			e.printStackTrace();
			throw e;
		}
		return result;
	}

}
