package com.company;

import java.util.Scanner;
public class SingleArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.print(i+ " Enter the value: ");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.println("The sum of array is = "+sum);
	}

}
