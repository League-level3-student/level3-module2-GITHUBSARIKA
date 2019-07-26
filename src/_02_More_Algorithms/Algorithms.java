package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				x++;

			}

		}
		return x;
	}

	public static double findTallest(List<Double> peeps) {
		double longest = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > longest) {
				longest = peeps.get(i);

			}
		}
		return longest;
	}

	public static String findLongestWord(List<String> words) {
		String longestWord = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;

	}

	public static boolean containsSOS(List<String> sos) {
		for (int i = 0; i < sos.size(); i++) {
			if (sos.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	static boolean doubleArraySorted(List<Double> score) {
		for (int i = 0; i < score.size() - 1; i++) {
			if (score.get(i + 1) < score.get(i)) {
				return false;
			}
		}
		return true;
	}

	public static List<Double> sortScores(List<Double> score) {
		while (doubleArraySorted(score) == false) {
			for (int i = 0; i < score.size() - 1; i++) {
				if (score.get(i + 1) < score.get(i)) {
					double x = score.get(i + 1);
					score.set(i + 1, score.get(i));
					score.set(i, x);

				}
			}
		}
		return score;
	}

	static boolean stringSorted(List<String> length) {
		for (int i = 0; i < length.size() - 1; i++) {
			if (length.get(i + 1).compareTo(length.get(i)) < 0) {
				return false;
			}
		}
		return true;
	}

	public static List<String> sortWords(List<String> length) {
		System.out.println("hi");
		while (stringSorted(length) == false) {
			for (int i = 0; i < length.size() - 1; i++) {
				if (length.get(i + 1).compareTo(length.get(i)) < 0) {
					String x = length.get(i + 1);
					length.set(i + 1, length.get(i));
					length.set(i, x);
				}

			}
		}
		return length;
	}

	static boolean stringSortedd(List<String> word) {
		for (int i = 0; i < word.size() - 1; i++) {
			if (word.get(i + 1).length() < word.get(i).length()) {
				return false;
			}
		}
		return true;
	}

	public static List<String> sortDNA(List<String> word) {

		while (stringSortedd(word) == false) {
			System.out.println("hi");
			for (int i = 0; i < word.size() - 1; i++) {
				if (word.get(i + 1).length() < word.get(i).length()) {
					String x = word.get(i + 1);
					word.set(i + 1, word.get(i));
					word.set(i, x);
				}
			}
		}
		return word;

	}

}
