import java.util.Scanner;

class ArmstrongNumber {
	public int Armstrong(int num){
		int arm;
		int n = num;
		for(int i = 1; i <= num; i++) {
			arm = i*i*i;
		}
		if(n == arm) {
			System.out.println(num+ " is a Armstrong Number.");
		}
		else
			System.out.println(num+ " isn't Armstrong Number.");
		return num;
	}
	
	
	public static void main(String[] args) {
		
	}
}
