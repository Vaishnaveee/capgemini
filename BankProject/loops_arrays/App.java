package loops_arrays;
import java.util.Scanner; 

public class App {
	public static void main(String[] args) {
	
		System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		System.out.println("Enter your college");
		String college = sc.next();
		
		if(marks<60)  
			System.out.println("Oops you dint pass");
		else  
			System.out.println("Great, U Cleared");
		 
		System.out.println(  marks<60?"Oops you dint pass":"Great, U Cleared"  );
		String grade = marks>60?"A": college.equals("vjti")?"V1":"B";
		
		System.out.println("Your grade is " + grade);
		 
	}
}
