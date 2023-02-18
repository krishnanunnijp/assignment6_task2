package com.nestjavatraining.entity;

public class Customer implements Comparable<Customer> {
private String customerName;
private int customerAge;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerAge() {
	return customerAge;
}
public void setCustomerAge(int customerAge) {
	this.customerAge = customerAge;
}
public Customer(String customerName, int customerAge) {
	this.customerName = customerName;
	this.customerAge = customerAge;
}
@Override
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	return this.getCustomerName().compareTo(o.getCustomerName());
}


}
