package com.prasanth.condiotionalstatement;

import java.util.Scanner;

public class IfelseLadder {

	public static void main(String[] args) {
		int marks;
		Scanner S = new Scanner(System.in);
		System.out.println("\nEnter the marks");
		marks = S.nextInt();
		    if (marks < 50 && marks != 50) {
			System.out.println("\nYour Grade is U(Fail)");
		    }else if (marks <= 50 && marks < 60) {
				System.out.println("\nYour Grade is E");
			} else if (marks <= 60 && marks < 70) {
				System.out.println("\nYour Grade is D");
			} else if (marks <= 70 && marks < 80) {
				System.out.println("\nYour Grade is C");
			} else if (marks <= 80 && marks < 90) {
				System.out.println("\nYour Grade is B");
			} else if (marks <= 90 && marks < 100) {
				System.out.println("\nYour Grade is A");
			} else if (marks == 100) {
				System.out.println("\nYour Grade is S");
			}
	}
}
