package com.LinkedListInit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	Customer customer = new Customer("Delton", 3000);
    	Customer anotherCustomer;
    	anotherCustomer = customer;
    	anotherCustomer.setBalance(2000);
		System.out.println("Balance for " + customer.getName() + " is " + customer.getBalance());
		//We are getting balance of cutomer as 2000
		//This is because anotherCustomer = customer; means that Java is pointing anotherCustomer to customer
		//We are not creating new object

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(2);
		intList.add(3);

		for(int i=0; i<intList.size(); i++)
			System.out.println(i+ ": " +intList.get(i));

		intList.add(1,5);
		System.out.println("\n\n");

		for(int i=0; i<intList.size(); i++)
			System.out.println(i+ ": " +intList.get(i));

	}
}