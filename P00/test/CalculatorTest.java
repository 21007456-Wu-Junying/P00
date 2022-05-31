import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 5555;
		int b = 1;
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 5555;
		assertEquals(actual,expected);
	}
	

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 5;
		int b = 1;
		Calculator cal = new Calculator();
		double actual = cal.divide(a, b);
		String expected = "5.0";
		assertEquals(Double.toString(actual),expected);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}



}
