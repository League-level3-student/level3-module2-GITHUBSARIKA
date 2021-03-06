package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}

	// 0. Since this sorting algorithm uses recursion,
	// we'll make a helper method called mergeSort.
	// Complete the steps in the mergeSort method.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		// 20. call the mergeSort method with 0 and the length of the array minus one
		mergeSort(array, 0, array.length - 1, display);
	}

	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		// 1. Create a temporary integer array that is the same length as the passed in
		// array.
		// done
		int[] arrray = new int[array.length];
		// 2. make an if statement that checks if low is less than high
		// and put the rest of the method inside of it
		// done
		if (low < high) {
			int middle = low + (high - low) / 2;
			mergeSort(array, low, middle, display);
			mergeSort(array, middle + 1, high, display);
			for (int i = low; i < high + 1; i++) {
				arrray[i] = array[i];

			}
			display.updateDisplay();
			int i = low;
			int j = middle + 1;
			int k = low;
			while (i <= middle && j <= high) {
				if (arrray[i] <= arrray[j]) {
					array[k] = arrray[i];
					i++;
				} else {
					array[k] = arrray[j];
					j++;

				}
				k++;
				display.updateDisplay();
			}
			while (i <= middle) {
				array[k] = arrray[i];
				k++;
				i++;
				display.updateDisplay();
			}

		}
		// 3. Create an integer called middle and set it
		// equal to the half way point between low and high
		// done
		// 4. call the mergeSort method with low and middle
		// done
		// 5. call the mergeSort method with middle + 1 and high
		// Done
		// 6. copy the elements from the array into the temporary array,
		// but only the elements from low to high inclusive
		// done
		// 7. create three integers called i, j, and k and
		// set them equal to low, middle + 1, and low respectively
		// done
		// 8. while i is less than or equal to middle
		// and j is less than or equal to high
		// done
		// 9. if temp array at i is less than or equal
		// to temp array at j
		// done
		// 10. set array at k equal to temp array at i
		// done
		// 11. increase i by 1
		// done
		// 13. else
		// done
		// 14. set array at k equal to temp array at j
		// done
		// 15. increase j by 1
		// done
		// 16. increase k by 1
		// done

		// 17. make a while loop that runs while i is less than or equal to middle
		// done
		// 18. set array at k equal to temp array at i
		// done
		// 19. increase k and i by 1
		// done

	}

}
