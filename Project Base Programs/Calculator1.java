import java.util.Scanner;

class Cal{
    
            void Add(){

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a First Value: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second Value: ");
                int b = sc.nextInt();
                System.out.println("The Sum of two numbers : "+(a+b));
        
            }
            void Sub(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a First Value: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second Value: ");
                int b = sc.nextInt();
                System.out.println("The Substraction of two numbers : "+(a-b));
            }
            void Mul(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a First Value: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second Value: ");
                int b = sc.nextInt();
                System.out.println("The Multiplication of two numbers : "+(a*b));
            }
            void Div(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a First Value: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second Value: ");
                int b = sc.nextInt();
                System.out.println("The Division of two numbers : "+(a/b));
            }
            void Mod(){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a First Value: ");
                int a = sc.nextInt();
                System.out.print("Enter a Second Value: ");
                int b = sc.nextInt();
                System.out.println("The Modulus of two numbers : "+(a%b));
            }

//class Calculator1 extends Cal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cal calculator = new Cal();
	

        System.out.println("Enter 1 for Addition.");
        System.out.println("Enter 2 for Substration.");
        System.out.println("Enter 3 for Multiplication.");
        System.out.println("Enter 4 for Division.");
	    System.out.println("Enter 5 for Modulus.");

        System.out.print("Select a number between 1-5: ");
        int num = sc.nextInt();
        
	switch(num){
		case 1:
			calculator.Add();
			break;
		case 2:
			calculator.Sub();
			break;
		case 3:
			calculator.Mul();
			break;
		case 4:
			calculator.Div();
			break;
		case 5:
			calculator.Mod();
			break;
	}

    }
    
}
	