package com.nitin.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramsProblem {

	public static int numberNeeded(String first, String second) {
		
	
		char[] firstA = first.toCharArray();
        char[] secondA = second.toCharArray();
        Arrays.sort(firstA);
        Arrays.sort(secondA);

        int i = 0, j = 0, differences = 0;
        for (; i < firstA.length && j < secondA.length; differences++, i++, j++) {
            if (firstA[i] > secondA[j]) {
                i--;
            } else if (firstA[i] < secondA[j]) {
                j--;
            } else {
                // they're equal
                differences--;
            }
        }
        int leftOnFirst = firstA.length - i;
        int leftOnSecond = secondA.length - j;
        return differences + leftOnFirst + leftOnSecond;
		}
		
		
		
	      
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
