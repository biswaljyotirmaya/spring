package com.jb.dao;

import com.jb.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("mysqlEmployeeDAO")
@Primary
public class MySQLEmployeeDAOImpl implements IEmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getEmployeeByDesgn(String desg1, String desg2, String desg3) throws Exception {
		String sql = "SELECT EMPNO, ENAME, JOB, SALARY, DEPTNO FROM EMP WHERE JOB IN (?, ?, ?)";
		return jdbcTemplate.query(sql, this::mapRowToEmployee, desg1, desg2, desg3);
	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		String sql = "INSERT INTO EMP (ENAME, JOB, SALARY, DEPTNO) VALUES (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, emp.getEname(), emp.getJob(), emp.getSalary(), emp.getDeptno());
	}

	private Employee mapRowToEmployee(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpNo(rs.getInt("EMPNO"));
		emp.setEname(rs.getString("ENAME"));
		emp.setJob(rs.getString("JOB"));
		emp.setSalary(rs.getDouble("SALARY"));
		emp.setDeptno(rs.getInt("DEPTNO"));
		return emp;
	}
}
