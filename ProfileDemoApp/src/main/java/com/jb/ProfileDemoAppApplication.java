package com.jb;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.jb.model.Employee;
import com.jb.service.EmployeeServiceImpl;

@SpringBootApplication
public class ProfileDemoAppApplication {

    public static void main(String[] args) throws IOException {
        // Run the Spring Boot application
        ApplicationContext ctx = SpringApplication.run(ProfileDemoAppApplication.class, args);

        // Get the EmployeeService bean
        EmployeeServiceImpl empserv = ctx.getBean("empService", EmployeeServiceImpl.class);
        Scanner sc = new Scanner(System.in);

        // Take user input for employee details
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

        // Employee Registration
        System.out.println("==========================Employee Registration================================");
        System.out.println("Enter Employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Employee's job: ");
        String job = sc.nextLine();
        System.out.println("Enter Employee's salary: ");
        Double salary = sc.nextDouble();
        System.out.println("Enter Employee's deptno: ");
        int deptno = sc.nextInt();

        // Create and set employee details
        Employee emp = new Employee();
        emp.setEname(name);
        emp.setJob(job);
        emp.setSalary(salary);
        emp.setDeptno(deptno);

        try {
            String resultMsg = empserv.insertEmployee(emp);
            System.out.println(resultMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close the application context
        ((Closeable) ctx).close();
    }

    @Bean
    public CommandLineRunner run(@Value("${spring.profiles.active}") String activeProfile) {
        return args -> {
            // Log the active profile at startup
            System.out.println("======================================");
            System.out.println("Active Profile: " + activeProfile);
            System.out.println("======================================");
        };
    }
}
