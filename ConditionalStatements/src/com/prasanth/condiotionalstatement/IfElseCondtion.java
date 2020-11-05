package com.prasanth.condiotionalstatement;

import java.util.*;

public class IfElseCondtion {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a = 13;
		System.out.println("The value of A:"+a);
		System.out.println("Enter a value:");
		int b = S.nextInt();
		if (a % 2 == 0) {
			System.out.println("13 is a even number");
		}
		if (a % 2 != 0) {
			System.out.println("13 is a odd number");
		}

		if ( b % 2 == 0) {
			System.out.println(b+" is a even number");
		} else {
			System.out.println(b+" is a odd number");
		}
	}
}