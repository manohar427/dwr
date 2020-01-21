package com.test;

public class Mojo {

	public Customer getMessage(Customer cust) {
		System.out.println(cust);
		Customer c = new Customer();
		c.setFname("Manohar");
		c.setLname("Samnbayyapalem");
		return c;
	}
}
