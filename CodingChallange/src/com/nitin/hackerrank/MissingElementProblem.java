package com.nitin.hackerrank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingElementProblem {
	
	IntStream in;
	public static void main(String args[]){
		
		
		int []a= {15,16,18};
		
		
		Arrays.sort(a);
		int sumShould = 0;
		int sumActual = 0;
		int temp = 0;
		System.out.println(IntStream.rangeClosed(0, a.length+1).sum()-IntStream.of(a).sum());
		System.out.println();
		if(a.length==0){
			System.out.println(1);
		}else{
			for(int i =0;i<a.length+1;i++){
				if(i==0){
					temp = a[0];	
				}
				
				sumShould= sumShould+temp; 
				
				temp++;
				if(i<a.length)
				sumActual= sumActual+a[i]; 
			}
		
			System.out.println(sumShould- sumActual);
		}
		
			
			
			
			
		
		
		
		
		
		
	}

}
