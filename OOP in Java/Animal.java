import java.util.Scanner;
public class Animal {
	Scanner sc = new Scanner(System.in);
	String name;
	public void Name() {
		System.out.println("Ente Animal Name: ");
		name = sc.next();
		System.out.println("You have entered: "+name);
	}
	public void eat() {
		System.out.println("This animal eats.");
	}
	public void walk() {
		System.out.println("This animal walks less.");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
	public void Mow() {
		System.out.println("Meaoon Meaoon.");
	}
	public void Add() {
		int a = 12;
		int b = 34;
		int sum = a + b;
		System.out.println("The Addition of two numbers is: " +sum);
	}
	public int Add1(int a, int b) {
		System.out.println("The Addition of two numbers is: " +(a+b));
		int sum = a + b;
		return sum;
	}
	public void Table(int num) {
		//code
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+ " * " +num+ " = " +(i*num));
		}
	}
	public void Name1(String name, int id, double d) {
		System.out.println("Name: " +name);
		System.out.println("Id: " +id);
		System.out.println("Salary: " +d);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal an = new Animal();
		an.Name1("Govind Kumar", 035, 500000.00);
		char ch = 'y';
		while(ch == 'y') {
			an.Name();
			an.eat();
			an.sleep();
			an.walk();
			an.Mow();
			an.Add();
			an.Add1(23,67);
			an.Table(56);
			System.out.println();
			System.out.println();
			System.out.println("if you wanna repeat this action then type y otherwise type something else");
			ch = sc.next().charAt(0);
		}
		System.out.println("Thank you.");
	}

}
