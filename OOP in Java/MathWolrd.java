
import java.util.Scanner;

class MathWorld {
	
	public void Mathworld() {
		System.out.println("Welcome to the Math World.");
	}
	public void Choice() {
		System.out.println("1. is for Addition");
		System.out.println("2. is for Substraction");
		System.out.println("3. is for Multiplication");
		System.out.println("4. is for Division");
		System.out.println("5. is for Modulus.");
		System.out.println("6. is for Factorial");
		System.out.println("7. is for Square");
		System.out.println("8. is for Cube");
		System.out.println("9. is for Table");
		
	}
	public void Add(int num1, int num2) {
		System.out.println("The Addition of two numbers is: " +(num1 + num2));
	}
	public void Sub(int num1, int num2) {
		System.out.println("The Substraction of two numbers is: " +(num1 - num2));
	}
	public void Mul(int num1, int num2) {
		System.out.println("The Multiplication of two numbers is: " +(num1 * num2));
	}
	public void Div(int num1, int num2) {
		System.out.println("The Division of two numbers is: " +(num1 / num2));
	}
	public void Mod(int num1, int num2) {
		System.out.println("The Modulus of two numbers is: " +(num1 % num2));
	}
	public void Fac(int num) {
		int fac = 1;
		for(int i = 1; i <= num; i++) {
			fac *= i;
		}
		System.out.println("The Factorial of a number is: " +fac);
	}
	public void Square(int num) {
		System.out.println("The Square of a number is: " +(num * num));
	}
	public void Cube(int num) {
		System.out.println("The Cube of a number is: " +(num * num * num));
	}
	public void Table(int table) {
		System.out.println("---Multiplication Table of a Given Number---");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+ " * " +table+ " = " +(i * table));
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MathWorld mw = new MathWorld();
		mw.Mathworld();
		
		char ch = 'y';
		while(ch == 'y') {
			mw.Choice();
			
			System.out.println("Please Enter your Choice: ");
			int choice = sc.nextInt();
			
			System.out.println("Enter a Number: ");
			int num1 = sc.nextInt();
			
	
			if(choice == 1)
			{
				System.out.println("Enter second Number: ");
				int num2 = sc.nextInt();
				mw.Add(num1, num2);
			}
			else if(choice == 2)
			{
				System.out.println("Enter second Number: ");
				int num2 = sc.nextInt();
				mw.Sub(num1, num2);
			}
			else if(choice == 3)
			{
				System.out.println("Enter second Number: ");
				int num2 = sc.nextInt();
				mw.Mul(num1, num2);
			}
			else if(choice == 4)
			{
				System.out.println("Enter second Number: ");
				int num2 = sc.nextInt();
				mw.Div(num1, num2);
			}
			else if(choice == 5)
			{
				System.out.println("Enter second Number: ");
				int num2 = sc.nextInt();
				mw.Mod(num1, num2);
			}
			else if(choice == 6)
			{
				mw.Fac(num1);
			}
			else if(choice == 7)
			{
				mw.Square(num1);
			}
			else if(choice == 8)
			{
				mw.Cube(num1);
			}
			else if(choice == 9)
			{
				mw.Table(num1);
			}
			else
			{
				System.out.println("Invalid Number.");
			}
			System.out.println("If you want to repeat this action then type \'Y\' otherwise any type any Character: ");
			ch = sc.next().charAt(0);
		}
		System.out.println("Thank you for Coming in Math World.");
	}
}

