package Assignments;

public class ExceptionPractice {
public static void main(String[] args) {
	
}
}
class E{
	int percent;
	int compute (double marks,double total ) throws InvalidMarkException {
		if(marks>total) {
			throw new InvalidMarkException("marks cannot be >total");
		}
		if (marks<0) {
			throw new InvalidMarkException("marks cannot be less tahn 0");
		}
			
		return percent=(int) ((marks*100)/total);
	}
	
}
class InvalidMarkException extends Exception{
	String message ;
	InvalidMarkException (String message){
		this.message=message;
		
	}
}
