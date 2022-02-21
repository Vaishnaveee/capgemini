package Assignments;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {
 @Test(expected= InvalidMarkException.class ) 
 public void percentTest() throws InvalidMarkException {
	 E e=new E();
	 try {
		 Assert.assertEquals(50, e.compute(50,100));
	 }
	 catch (InvalidMarkException x) {
		 x.getMessage();
	 }
	
}
}
