package com.jb.lombokTest;

import com.jb.lombok.Customer;

public class LombokTest {
	public static void main(String[] args) {
		Customer cstm = new Customer();
		cstm.setCName("David");;
		cstm.setBillAmt(137.68f);
		cstm.setCAge(22);
		cstm.setCno(113);
		System.out.println("Printing customer details!");
		System.out.println("Customer Number: " + cstm.getCno());
		System.out.println("Customer Name: " + cstm.getCName());
		System.out.println("Customer Age: " + cstm.getCAge());
		System.out.println("Bill Amount: " + cstm.getBillAmt());
	}
}