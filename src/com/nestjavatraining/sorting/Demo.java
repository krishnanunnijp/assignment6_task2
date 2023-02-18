package com.nestjavatraining.sorting;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		List<String> list= new ArrayList<String>();
		System.out.println("Enter 5 names to sort");
		for (int i=0;i<5;i++) {
			list.add(scanner.next());
		}
	    Collections.sort(list);
		System.out.println(list);
	}



}
