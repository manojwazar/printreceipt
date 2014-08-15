package com.ae.run;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user_input = new Scanner(System.in);

		String first_name;
		System.out.print("Enter your first name: ");
		first_name = user_input.next();

		String family_name;
		System.out.print("Enter your family name: ");
		family_name = user_input.next();

		String full_name;
		full_name = first_name + " " + family_name;

		System.out.println("You are " + full_name);
	}

}
