package com.jb.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Component("customer") 
@ConfigurationProperties(prefix = "cust.info")
@Data 
public class Customer {
    private Integer custNo;
    private String custname;
    private String custAddrs;
    private Double billAmount;
}
