// CCI pg.90, #1.2 Check Permutations

import java.util.*;

class URLify {
	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		System.out.println(URLify(s, 13));

	}
	public static char[] URLify(String s, int length) {
		char[] c = s.toCharArray();
		if (!(s.contains(" "))) {return c;}
		System.out.println(c);
		int numSpaces = 0;
		for(int i =0; i <s.length(); i++) {
			if(c[i] == ' ') {
				numSpaces++;
			}
		}
		System.out.println(numSpaces);
		int fullLength = s.length();
		for(int i = length-1; i >=0; i--) {

			if(c[i] != ' ') {
				c[fullLength-1] = c[i];
				fullLength--;
			}
			else {
				c[fullLength-1] = '0';
				c[fullLength-2] = '2';
				c[fullLength-3] = '%';
				
				fullLength--;
				fullLength--;
				fullLength--;


			}
		}
		return c;
	}
}