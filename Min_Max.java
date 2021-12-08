package com.company;

public class Min_Max {
	public static void main(String[] args) {

		int[] num = { 6, 2, 10, 4, 5 };

		int min,max;
		min = num[0];
		max = num[0];
		
		  for(int i = 0; i < num.length; i++) { 
		  if(min > num[i]) {
			  min = num[i];
		  }
		  if(max < num[i]) {
			  max = num[i];
		  }
		  }
		 
		System.out.println("The Maximum number is = " + max);
		System.out.println("The Minimun number is = " + min);

	}

}
