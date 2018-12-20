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
		int[] array = new int[] {7,9,12,18,24,27,29,64,77,88,92,99,108,122,128};
		assertEquals(0,_01_BinarySearch.binarySearch(array, 0, array.length-1, 7));
		assertEquals(2,_01_BinarySearch.binarySearch(array, 0, array.length-1, 12));
		assertEquals(-1,_01_BinarySearch.binarySearch(array, 0, array.length-1, 3));
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] array = new int[] {0,3,6,9,12,15,18,21,24,27,30};
		assertEquals(0,_02_InterpolationSearch.interpolationSearch(array, 0));
		assertEquals(1,_02_InterpolationSearch.interpolationSearch(array, 3));
		assertEquals(5,_02_InterpolationSearch.interpolationSearch(array, 15));
		
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] array = new int[] {3,7,22,55,321,333,345,349};
		assertEquals(2,_02_InterpolationSearch.interpolationSearch(array, 22));
		assertEquals(4,_02_InterpolationSearch.interpolationSearch(array, 321));
		assertEquals(3,_02_InterpolationSearch.interpolationSearch(array, 55));
	}
}
