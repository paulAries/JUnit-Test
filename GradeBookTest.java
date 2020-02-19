package gradeBook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GradeBookTest {

	/*
	 * Create an object for the class
	 * **/
	GradeBook grade1;
	
	@Before
	public void setUp() throws Exception {
	   grade1= new GradeBook(5); // create an object of at least 5 gradeBooks
	   grade1.addScore(90.0); // add scores to the array.
	   grade1.addScore(85.0);
	   grade1.addScore(60.0);
	}

	@After
	public void tearDown() throws Exception {
	 grade1=null;
	}
	
	@Test
	public void testAddScore() {
		assertEquals(3.0,grade1.getScoreSize(),.001);
		assertTrue(grade1.toString().equals("90.0 85.0 60.0 "));	
	}
  // Test for the Sum method
	@Test
	public void testSum() {
		assertEquals(235.0,grade1.sum(),.0001);
	}
//   Test for the Minimum method
	@Test
	public void testMinimum() {
		assertEquals(60.0,grade1.minimum(),.0001);
	}
    // Test for the FinalScore method
	@Test
	public void testFinalScore() {
		assertEquals(175.0,grade1.finalScore(),.0001);
	}
// Test for the GetScoreSize method
	@Test
	public void testGetScoreSize() {
		assertEquals(3.0,grade1.getScoreSize(),.001);
	}
// Test for the toString method
	@Test
	public void testToString() {
		assertTrue(grade1.toString().equals("90.0 85.0 60.0 "));
	}

}
