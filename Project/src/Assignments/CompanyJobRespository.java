package Assignments;

public class CompanyJobRespository {
static String getJobRespository(int age,String highestQualification) throws NotEligibleException {
		
		if(!(age>=19)) {
			throw new NotEligibleException("You are underage for any job");
		}
		if(age>=21 && highestQualification.equals("BE") ) {
			return "We have openings for junior developer";
		}
		if(age>=26 && highestQualification.equals("MS") ||highestQualification.equals("PhD") ) {
			return "We have openings for senior developer";
		}
		if(age>=19 && !(highestQualification.equals("BE")|| highestQualification.equals("MS") ||highestQualification.equals("PhD")) ) {
			return "We do not have any job that matches your qualifications";
					   
		}
		
		else
	        return "Sorry we have no openings for now";
	}

}
 class Source {

	public String SearchForJob(int age, String highestQualification) throws NotEligibleException {
		 
		if(age>=200) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		if(age<=0) {
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		
		else {
		CompanyJobRespository c= new CompanyJobRespository();
		return c.getJobRespository(age, highestQualification);}
	 }
	
	public static void main(String[] args) throws NotEligibleException {
		Source s= new Source();
		System.out.println(s.SearchForJob(26,"PhD"));
	}
}
class NotEligibleException extends Exception{
	String msg;
	 NotEligibleException(String msg){
		this.msg=msg;
	}
	 public String getMessage() {
		 return msg;
		 }
}