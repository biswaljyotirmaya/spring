package com.jb;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jb.model.Employee;
import com.jb.service.EmployeeServiceImpl;

@SpringBootApplication
public class BootProj04Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = SpringApplication.run(BootProj04Application.class, args);
		EmployeeServiceImpl empserv = ctx.getBean("empService", EmployeeServiceImpl.class);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter desg1:");
		String desg1 = sc.nextLine();
		System.out.println("Enter desg2:");
		String desg2 = sc.nextLine();
		System.out.println("Enter desg3:");
		String desg3 = sc.nextLine();

		try {
			List<Employee> list = empserv.fetchEmployeeByDesgn(desg1, desg2, desg3);
			list.forEach(emp -> {
				System.out.println("\n" + emp);
			});
		} catch (Exception e) {
			System.out.println("Internal error: " + e);
		}

		System.out.println("==========================Employee Registration================================");
		System.out.println("Enter Employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee's job: ");
		String job = sc.nextLine();
		System.out.println("Enter Employee's salary: ");
		Double slary = sc.nextDouble();
		System.out.println("Enter Employee's deptno: ");
		int deptno = sc.nextInt();

		Employee emp = new Employee();
		emp.setEname(name);
		emp.setJob(job);
		emp.setSalary(slary);
		emp.setDeptno(deptno);
		try {
			String resultMsg = empserv.insertEmployee(emp);
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((Closeable) ctx).close();
	}

}
