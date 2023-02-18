package com.nestjavatraining.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.nestjavatraining.entity.Customer;

public class customerUtility {

	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);

		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Suneesh", 36));
		customerList.add(new Customer("Keyaan", 4));
		customerList.add(new Customer("Remi", 32));
		customerList.add(new Customer("Saranya", 22));
		customerList.add(new Customer("Arjun", 23));
		customerList.add(new Customer("Vineeth", 19));
		System.out.println("");
		System.out.println("Customer List Before Sorting");
		System.out.println("Customer Name" + " " + "Customer Age");
		for (Customer customer : customerList)
			System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());
		do { 
			System.out.println("------------Menu---------\r\n"
					+ "1. Sort on Customer Name\r\n"
					+ "2. Sort on Customer Age.\r\n"
					+ "Enter your choice :");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				nameSort(customerList);
				break;
			case 2:
				ageSort(customerList);
				break;
			default:
				System.out.println("Invalid Choice");
				 }
			System.out.println("Do you want to continue (y/n)");
			ch = scanner.next().charAt(0);
			} while (ch == 'y');
	}
	public static void ageSort(List<Customer> customerList) {
		System.out.println("");
		System.out.println("Customer List After Sorting Based On Age");
		System.out.println("Customer Name" + " " + "Customer Age");
		sortWithAge(customerList);
		for (Customer customer : customerList)
			System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());
	}
	public static void nameSort(List<Customer> customerList) {
		System.out.println("");
		System.out.println("Customer List After Sorting Based On Age");
		System.out.println("Customer Name" + " " + "Customer Age");
		Collections.sort(customerList);
		for (Customer customer : customerList)
			System.out.println(customer.getCustomerName() + " " + customer.getCustomerAge());
	}
  
  
	public static void sortWithAge(List<Customer> list){
	        int n = list.size();
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (list.get(j).getCustomerAge() > list.get(j+1).getCustomerAge()) {
	                    Customer temp = list.get(j);
	                    list.set(j, list.get(j+1));
	                    list.set(j+1, temp);
	                }
	}

}
