package Junitdemo.service;

public class MockitoService {
public String computeGrade(int marks) {
	if (marks>100 || marks<100);
	return "invalid marks";
	 return marks>70?"A":marks>60?"B":"C";
	}
}
