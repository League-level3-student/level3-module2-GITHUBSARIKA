package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1] < array[i]) {
				return false;
			}
		}
		return true;

	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] hi) {
		for (int i = 0; i < hi.length - 1; i++) {
			if (hi[i + 1] < hi[i]) {
				return false;
			}
		}
		return true;

	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean charArraySorted(char[] character) {
		for (int i = 0; i < character.length - 1; i++) {
			if (character[i + 1] < character[i]) {
				return false;
			}
		}
		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] string) {
		for (int i = 0; i < string.length - 1; i++) {
			if (string[i + 1].compareTo(string[i]) < 0) {
				return false;
			}
		}
		return true;
	}

}
