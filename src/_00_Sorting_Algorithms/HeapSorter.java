package _00_Sorting_Algorithms;

public class HeapSorter extends Sorter {

	public HeapSorter() {
		type = "Heap";
	}

	@Override
	void sort(int[] array, SortingVisualizer display) {
		// int[] nArr = new int[array.length + 1];
		//
		// for (int i = 0; i < array.length; i++) {
		// nArr[i] = array[i];
		// }
		//
		// nArr[array.length] = SortingVisualizer.MAX;
		//
		// array = nArr;
		while (!checkOrder(array)) {
			for (int i = 0; i < array.length; i++) {
				flip(array, i);
			}
			display.updateDisplay();
		}
	}

	void flip(int[] array, int i) {
		for (int j = 0; j < array.length; j++) {
			if (array[j] > array[i] - 2 && j < i) {
				int temp = array[j];
				array[j] = array[i - 1];
				array[i - 1] = temp;

				return;
			}
		}
	}

	boolean checkOrder(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
