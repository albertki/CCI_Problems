// CCI pg.90, #1.2 Check Permutations

import java.util.*;

class isPermutation {
	public static void main(String[] args) {

		System.out.println(isPermutation("dog", "ogd"));

	}
	public static boolean isPermutation(String a, String b) {
		if (a.length()!= b.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		int length = a.length();
		for(int i=0; i<length; i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i),0)+1);
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i=0; i<length; i++) {
			map2.put(b.charAt(i), map2.getOrDefault(a.charAt(i),0)+1);
		}
		int i =0;
		while(i<length) {
			if (map.get(i) != map2.get(i)) {
				return false;
			}
			i++;
		}
		return true;
	}
}