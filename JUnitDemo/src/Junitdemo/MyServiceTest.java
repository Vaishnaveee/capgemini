package Junitdemo;
import org.junit.Assert;
import org.junit.Test;


public class MyServiceTest {
@Test
public void sumTest() {
	MyService service=new MyService();
	Assert.assertEquals(4, service.sum(2,2));
	Assert.assertEquals(10, service.sum(5,5));
	Assert.assertEquals(-4, service.sum(-2,-2));
	Assert.assertEquals(0, service.sum(-2,2));
	System.out.println("Test case done...");
}
@Test
public void computeGradeTest() {
	MyService service=new MyService();
	Assert.assertEquals("A",service.computeGrade(80));
	Assert.assertEquals("B", service.computeGrade(65));
	Assert.assertEquals("C", service.computeGrade(55));
Assert.assertEquals("Invalid marks", service.computeGrade(101));
}

@Test
public void  addProductTest() {
	MyService service=new MyService();
	Product p=new Product("Oppo",20000);
	Assert.assertEquals(0, service.list.size());
	Assert.assertEquals("new product added", service.addProduct(p));
	Assert.assertEquals(1, service.list.size());
	Assert.assertEquals("product already exist", service.addProduct(p));
	Assert.assertEquals(1, service.list.size());
	Product p1=new Product("Samsung",30000);
	Assert.assertEquals("new product added", service.addProduct(p1));
	Assert.assertEquals(2, service.list.size());
}
@Test
  public void removeProductTest() {
	MyService service=new MyService();
	Product p=new Product("Oppo",20000);
	Assert.assertEquals(0, service.list.size());
	service.addProduct(p);
	Assert.assertEquals(1, service.list.size());
	
	Assert.assertEquals("product removed", service.removeProduct(p));

}
@Test
public void listSize() {
	MyService service=new MyService();
	Product p=new Product("Oppo",20000);
	Product p1=new Product("Samsung",30000);
	 Assert.assertEquals(0, service.listSize());
	 service.addProduct(p);
	 service.addProduct(p1);
	 Assert.assertEquals(2, service.listSize());
	 
	
}
}
