package com.main;

import java.util.List;
import java.util.Scanner;

import com.main.Student;

public class APP {
	public static void main(String[] args) {	
		DBCon db = new DBCon();
		Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to the Project");
			while (true) {
				System.out.println("****MENU****");
				System.out.println("Press 1 for insertion");
				System.out.println("Press 2 for deletation");
				System.out.println("Press 3 for updation");
				System.out.println("Press 4 for frtching the data");
				System.out.println("Press 0 to exit");
				System.out.println("**********");
				
				int input =sc.nextInt();
				if (input==0) {
					System.out.println("Exiting...Bye!");
					break;
				}
				switch(input) {
				case 1 :
					Student s=new Student();
					System.out.println("Enter student details");
					System.out.println("Enter student name");
					s.setName(sc.next());
					System.out.println("Enter city");
					s.setCity(sc.next());
					System.out.println("Enter age");
					s.setAge(sc.nextInt());
					System.out.println("Enter department id");
					s.setDepartmentId(sc.nextInt());
					db.insertStudent(s);
					System.out.println("Record inserted");
				case 2: 
			   		System.out.println("Deletation operation");
			   		System.out.println("enter student id to be deleted");
			   		System.out.println("Enter STUDENT ID");
			   		int id=sc.nextInt();
			   		db.deleteStudent(id);
			   		System.out.println("Student Record deleted............");
			   		break;
	      
		   case 3:
				    System.out.println("UPDATE OPERATION");
				    System.out.println("ENTER ID OF STUDENTNT TO UPDATE");
				    id=sc.nextInt();
				    Student student=db.fetchstudentById(id);
				    System.out.println("EXISTING DETIALS OF STUDENT WIT ID"+id+"ARE:");
				    System.out.println(student.getName()+"  "+student.getCity()+" "+student.getAge()+" "+student.getDepartmentId());
				    System.out.println("please provide details to update");
				   
				    System.out.println("Enter student details");
				       System.out.println("Enter student name");
				       s.setName(sc.next());
				       System.out.println("Enter City");
				       s.setCity(sc.next());
				       System.out.println("Enter Age");
				       s.setAge(sc.nextInt());
				       System.out.println("Enter DEPARTMENT ID");
				       s.setDepartmentId(sc.nextInt());
				       db.updateStudent(s,id);
				       System.out.println("RECORD INSERTED.........");
				    break;
		   case 4:
			        System.out.println("ALL STUDENT RECORDS");
			        System.out.println("*****************");
			        System.out.println("ID\tNAME\t\tCITY\t\tAGE_OF_STUDENT\t\tDEPT_ID");
			        List<Student> list=db.fectchAllStudent();
			        for(Student stud:list) {
			        	
			        	System.out.println(stud.getId()+ "\t" +stud.getName()+"\t"+stud.getCity()+"                "+stud.getAge()+"\t\t"+stud.getDepartmentId());
			        	
			        }
			        System.out.println("**************");
			        while(true) {
			        	
			        	System.out.println("**operation menu***");
			        	System.out.println("1. to sort the records as per age");
			        	System.out.println("2. to group the records as per city");
			        	System.out.println("3. to group the records as per departmetn");
			        	System.out.println("11 to go back to the main menu");
			        	int opinput=sc.nextInt();
			        	if(opinput==11) {
			        		break;
			        	}
			        switch(opinput) {
			        case 1:
			        	 System.out.println("****sorted list as per the age*****");
			        	 System.out.println("ID\tNAME\t\tCITY\t\tAGE_OF_STUDENT\t\tDEPT_ID");
					     
						List<Student> sortedList= studentService.sortByAge(list);
					       for(Student stud:sortedList) {
					        	
					        	System.out.println(stud.getId()+ "\t" +stud.getName()+"\t"+stud.getCity()+"                "+stud.getAge()+"\t\t"+stud.getDepartmentId());
					        	
					        }
					       System.out.println("**************");
					        break;
					        
					        
			        case 2:   
			        	System.out.println("****group the records as per city*****");
			        	System.out.println("city\t\tnumber of student");			
				       System.out.println("**************");
				       LinkedHashMap<String,Integer> map=db.FetchStudentGroupByCity();
				      for( Map.Entry<String,Integer> entry:map.entrySet()) {
				    	  System.out.println(entry.getKey()+"\t\t"+entry.getValue());
		  
				      }
				      System.out.println("**********");
				        break; 
			           
			        case 3:
			        	System.out.println("**** to group the records as per departmetn*****");
			        	System.out.println("dept_id\t\tnumber of student");			
				       System.out.println("**************");
				       LinkedHashMap<Integer,Integer> map1=db.FetchStudentGroupByDept();
				      for( Map.Entry<Integer,Integer> entry:map1.entrySet()) 
				      {
				    	  
				    	  System.out.println(entry.getKey()+"\t\t"+entry.getValue());
		  
				         }
				      System.out.println("**********");
				        break; 
			           }
			        }
				}
			}
}
}
