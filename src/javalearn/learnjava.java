package javalearn;

import java.util.Scanner;

public class learnjava {

	public static void main(String[] args) {
		learnjava lj=new learnjava();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=sc.nextInt();
		lj.add2numbers(num1,num2);
	}
	private void add2numbers(int a,int b) {
		long sum=a+b;
		System.out.println("Addition of 2 numbers is "+sum);
	}
	private void sub2numbers(int a, int b) {
		long sub=a-b;
		System.out.println("Subtraction of 2 numbers is "+sub);
	}

}
