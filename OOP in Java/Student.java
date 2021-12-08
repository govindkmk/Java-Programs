public class Student{
	String roll_No;
	String name;
	String department;
	//double gpa;
	static boolean st = true;
	
	public Student(){
		System.out.println("It is real world entities: " +st);
		System.out.println("----This is Detail of Student----");
		
	}
	public void Details(){
		System.out.println("Roll No.\t " +roll_No);
		System.out.println("Name:\t\t " +name);
		System.out.println("Department:\t " +department);
	}
	public void GPA(double gpa){
		System.out.println("GPA:\t\t " +gpa);
	}
	public void Lines(){
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.roll_No = "20BSCS013";
		s.name = "Suleman Serai";
		s.department = "BS Computer Science";
		s.Details();
		s.GPA(3.89);
		
		s.Lines();
		
		Student s1 = new Student();
		s1.roll_No = "20BSCS009";
		s1.name = "Ahmad Qazi";
		s1.department = "BS Computer Science";
		s1.Details();
		s1.GPA(3.50);
		
		s.Lines();
		
		Student s2 = new Student();
		s2.roll_No = "20BSCS029";
		s2.name = "Tushar Lakhani";
		s2.department = "BS Computer Science";
		s2.Details();
		s2.GPA(3.74);
		
		s.Lines();
		
		Student s3 = new Student();
		s3.roll_No = "20BSCS031";
		s3.name = "Kapil Mukhi";
		s3.department = "BS Computer Science";
		s3.Details();
		s3.GPA(3.97);
	
	}
}