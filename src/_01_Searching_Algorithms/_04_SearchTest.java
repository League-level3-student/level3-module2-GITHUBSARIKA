package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] testing= {"burgers", "nachos", "pizza", "preztels", "food", "taco"};
		
		assertEquals(4, _00_LinearSearch.linearSearch(testing, "food"));
		assertEquals(0, _00_LinearSearch.linearSearch(testing, "burgers"));
		assertEquals(2, _00_LinearSearch.linearSearch(testing,"pizza"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] test= {4, 5, 7, 9, 35,7787, 9999};
		assertEquals(5,_01_BinarySearch.binarySearch(test,0, test.length-1, 7787 ));
		assertEquals(6, _01_BinarySearch.binarySearch(test, 0, test.length-1, 9999));
		assertEquals(3, _01_BinarySearch.binarySearch(test, 0, test.length-1, 9));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] tests= {0, 1, 2, 3, 4, 5, 6};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(tests, 1));
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(tests, 6));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(tests, 4));
	}
	
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] taco= {54, 97, 227, 550, 1023, 4926};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(taco, 227));
		assertEquals(5,_03_ExponentialSearch.exponentialSearch(taco, 4926) );
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(taco, 1023));
		
	}
}
