package Junitdemo.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoServiceTest {
MockitoService mockitoService;
@Before
public void initTest() {
	 mockitoService = Mockito.mock(MockitoService.class);
	
}
@Test
public void computeGradeTest() {
	Mockito.when(mockitoService.computeGrade(80)).thenReturn("A");
	Mockito.when(mockitoService.computeGrade(65)).thenReturn("B");
	Mockito.when(mockitoService.computeGrade(55)).thenReturn("C");
	Mockito.when(mockitoService.computeGrade(180)).thenReturn("invalid marks");
	
}
}
