package _00_Sorting_Algorithms;

public abstract class Sorter {
	public String type;

	abstract void sort(int[] array, SortingVisualizer display);

	public boolean checkSorted(int[] array) {
		boolean r = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i] + 1) {
				r = false;
			}
		}
		return r;
	}
}
