package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i) == "cracked") return i;
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int i = 0;
		for(Boolean b : oysters) if(b) i++;
		return i;
	}
	
	public static double findTallest(List<Double> heights) {
		double i = 0.0;
		for(Double b : heights) if(b > i) i = b;
		return i;
	}
	
	public static String findLongestWord(List<String> words) {
		String i = "";
		for(String b : words) if(b.length() > i.length()) i = b;
		return i;
	}
	
	public static boolean containsSOS(List<String> message) {
		for(String b : message) if(b.contains("... --- ...")) return true;
		return false;
	}
}
