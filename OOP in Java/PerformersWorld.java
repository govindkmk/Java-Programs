import java.util.Scanner;

class PerformersWorld {
	public int Number(int num){
        return num;
    }
    public void Square(int num){
        System.out.println("The Square of a number is: " +(num*num));
    }
    public void StrongNumber(int num){
        int fac = 1;
        int sum = 0;

        for(int i = 1; i <= num; i++){
            fac *= i;
            sum += i;
        }
        System.out.println("The Factorial of a Number is: " +fac);
        System.out.println("The Sum of a Number is: " +sum);

        if(fac == sum){
            System.out.println(num+ " is a Strong Number.");
            System.out.println("The Fabinacci Series till Number is: ");
            int previous = -1, next = 1, nextTerm = 0;
            for(int i = 1; i <= num; i++){
                nextTerm = next + previous;
                System.out.print(nextTerm+", ");
                previous = next;
                next = nextTerm;
            }
        }
        else{
            System.out.println(num+ " isn't a Strong Number.");
            System.out.println("The Tribonacci Series till Number is: ");
            int previous = 0, next = 1, nextTerm = 1,thirdnum = 0;
            for(int i = 1; i <= num; i++){
                thirdnum = previous + next + nextTerm;
                System.out.print(thirdnum+", ");
                previous = next;
                next = nextTerm;
                nextTerm = thirdnum;
            }
        }
    }
    public void Palindrome(int num){
        int rev = 0; 
        int rem;
        int n = num;
        for(int i = 1; i <= num; num /= 10){
            rem = num % 10;
            rev = (rev * 10) + rem;
        }
        System.out.println("The Reverse of a Number is: " +rev);
        if(n == rev){
            System.out.println(n+ " is a Palindrome Number.");
            System.out.println("The Multiplication Table of a Number.");
            for(int i = 1; i <= 10; i++){
                System.out.println(i+ " * " +num+ " = " +(i*num));
            }
        }
        else{
            System.out.println(n+ " isn't a Palindrome Number.");
            int fac = 1;
            for(int i = 1; i <= num; i++){
                fac *= i;
            }
            System.out.println("The Factorial of a Number is: " +fac);
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PerformersWorld pw = new PerformersWorld();
        
        char ch = 'y';
        while(ch == 'y') {
	        System.out.println("Enter a Number: ");
	        int num = in.nextInt();
	        pw.Number(num);
	        pw.Square(num);
	
	        int num1 = num * num;
	       
	        if(num1 % 2 == 0){
	            pw.StrongNumber(num);
	        }
	        else{
	            pw.Palindrome(num);
	        }
	        System.out.println();
	        System.out.println("If you want to repeat this action then type \'Y\' otherwise any type any Character: ");
			ch = in.next().charAt(0);
		}
		System.out.println("Thank you for Coming in Performers World.");
        
        
    }

}
