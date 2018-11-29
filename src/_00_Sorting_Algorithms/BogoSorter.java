package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	Random rnd = new Random();
	final int updateInterval = 100000000;

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		long i = 0, amount = 0;
		while (!isSorted(array)) {
			int a = rnd.nextInt(array.length);
			int b = rnd.nextInt(array.length);

			int temp = array[a];
			array[a] = array[b];
			array[b] = temp;

			if (i == updateInterval) {
				display.updateDisplay();
				i = 0;
				amount += updateInterval;

				System.out.println("Amount of tries: " + amount);
			}
			i++;
		}
	}

	boolean isSorted(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
