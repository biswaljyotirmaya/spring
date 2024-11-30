package com.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.jb.sbeans.Customer;

@SpringBootApplication
public class BootProjYmlTestApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BootProjYmlTestApplication.class, args);
        Customer cust = ctx.getBean("customer", Customer.class); // Retrieve the Customer bean
        System.out.println(cust); // Print the Customer bean
        ((ConfigurableApplicationContext) ctx).close();
    }
}
