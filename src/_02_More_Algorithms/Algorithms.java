package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")){
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean>oysters) {
		int x=0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				x++;
				
			}
			
		}
		return x;
	}
	public static double findTallest(List<Double>peeps) {
		double longest=peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>longest) {
				longest=peeps.get(i);
				
			}
		}
		return longest;
	}
	
	public static String findLongestWord(List<String>words) {
	String longestWord=words.get(0);
	for (int i = 0; i < words.size(); i++) {
		if(words.get(i).length()>longestWord.length()) {
			longestWord=words.get(i);
		}
	}
	return longestWord;
		
	}
	
	public static boolean containsSOS(List<String>sos) {
		for (int i = 0; i < sos.size(); i++) {
			if (sos.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static double sortScores(List<Double>score) {
		
	}
}

