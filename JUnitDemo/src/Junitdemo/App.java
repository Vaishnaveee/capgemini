package Junitdemo;

public class App {
 public static void main(String[] args) {
	MyService service= new MyService();
	int result= service.sum(5,10);
	System.out.println("sum is"+result);
}
}
