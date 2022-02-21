package Junitdemo.service;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class ExceptionServiceTest {
ExceptionService exceptionService;
@Before
public void init() {
	exceptionService=new ExceptionService();
	
}
@Test
public void computeTest() {
	Assert.assertEquals(2, exceptionService.compute(10, 5));
	Assert.assertEquals(2, exceptionService.compute(10, 0));
}
@After 
public void after() {
	exceptionService=null;
}
}
