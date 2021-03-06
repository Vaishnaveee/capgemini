package Assignments;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
public class JobTest {
	@Test
	public void searchForjob() throws NotEligibleException {
		
		 Source e=new Source();
		 try {
		    	e.SearchForJob(202, "BE");
		    }
		    catch(NotEligibleException x) {	
		    	assertEquals("The age entered is not typical for a human being",x.getMessage());	
		    }
		 
		
	}
	@Test
	public void getjob() throws NotEligibleException {
		
		CompanyJobRespository b=new CompanyJobRespository();
		 try {
		    	b.getJobRespository(18, "BE");
		    }
		    catch(NotEligibleException x) {	
		    	assertEquals("your underage of any job",x.getMessage());	
		    }
		 
		 try {
		    	b.getJobRespository(29, "MS");
		    }
		    catch(NotEligibleException x) {	
		    	assertEquals("we have opining s for senior developer",x.getMessage());	
		    }
		 try {
		    	b.getJobRespository(29, "ME");
		    }
		    catch(NotEligibleException x) {	
		    	assertEquals("we dont have any opnings for now",x.getMessage());	
		    }
	}

	}

