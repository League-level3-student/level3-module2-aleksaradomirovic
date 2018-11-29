package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		String[] words = new String[] { "toaster", "plus", "bathtub" };
		// 1. use the assertEquals method to test your linear search method.
		assertEquals(0, _00_LinearSearch.linearSearch(words, "toaster"));
		assertEquals(2, _00_LinearSearch.linearSearch(words, "bathtub"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "KCN"));
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
	}
}
