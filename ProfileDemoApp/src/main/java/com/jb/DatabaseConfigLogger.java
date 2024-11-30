package com.jb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DatabaseConfigLogger {

	@Value("${spring.datasource.url}")
	private String dbUrl;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClass;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.type}")
	private String dataSourceType;

	@Value("${spring.datasource.hikari.pool-name:NA}")
	private String hikariPoolName; // Hikari (default) pool name (if applicable)

	@Value("${spring.datasource.tomcat.pool-name:NA}")
	private String tomcatPoolName; // Tomcat pool name (if applicable)

	@Value("${spring.datasource.c3p0.pool-name:NA}")
	private String c3p0PoolName; // C3P0 pool name (if applicable)

	@Value("${spring.datasource.dbcp2.pool-name:NA}")
	private String dbcp2PoolName; // DBCP2 pool name (if applicable)

	public void logConfig() {
		System.out.println("======================================");
		System.out.println("Database URL: " + dbUrl);
		System.out.println("Database Driver: " + driverClass);
		System.out.println("Database Username: " + username);
		System.out.println("Datasource Type: " + dataSourceType);
		System.out.println("Connection Pool Type:");

		if (!hikariPoolName.equals("NA")) {
			System.out.println("  - HikariCP: " + hikariPoolName);
		}
		if (!tomcatPoolName.equals("NA")) {
			System.out.println("  - Tomcat Pool: " + tomcatPoolName);
		}
		if (!c3p0PoolName.equals("NA")) {
			System.out.println("  - C3P0 Pool: " + c3p0PoolName);
		}
		if (!dbcp2PoolName.equals("NA")) {
			System.out.println("  - DBCP2 Pool: " + dbcp2PoolName);
		}
		System.out.println("======================================");
	}
	 @PostConstruct
	    public void init() {
	        logConfig();
	    }
}
