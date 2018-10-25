package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		System.out.println(checkSorted(array));
		while (checkSorted(array)) {
			System.out.println(checkSorted(array));
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
				}
			}
			display.updateDisplay();
		}
	}

}
