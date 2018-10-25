package _00_Sorting_Algorithms;

public class DiceSorting extends SortingVisualizer {
	private static final long serialVersionUID = 1L;

	public DiceSorting(Sorter sorter) {
		super(sorter);
		// TODO Auto-generated constructor stub
	}

	@Override
	void randomizeArray() {
		for (int i = 0; i < array.length; i++) {
			array[i] = randGen.nextInt(MAX / 4) + randGen.nextInt(MAX / 4) + array[i] + randGen.nextInt(MAX / 4)
					+ randGen.nextInt(MAX / 4);
		}
		updateDisplay();
	}
}
