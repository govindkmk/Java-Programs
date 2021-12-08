package com.company;

public class InvertPyramid {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 6; k >= i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	
		int i = 1;
		while(i <= 6) {
			int j = 1;
			while(j <= i) {
				System.out.print(" ");
				j++;
			}
			int k = 6;
			while(k >= i) {
				System.out.print("* ");
				k--;
			}
			System.out.println();
			i++;	
		}
		
		int l = 1;
		do {
			int j = 1;
			do {
				System.out.print(" ");
				j++;
			}while(j <= l);
			int k = 6;
			do {
				System.out.print("* ");
				k--;
			}while(k >= l);
			System.out.println();
			l++;
		}while(l <= 6);
	}
}


