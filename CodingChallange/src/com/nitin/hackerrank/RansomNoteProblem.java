package com.nitin.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNoteProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	        }
	        
	        Arrays.sort(ransom);
	        Arrays.sort(magazine);
	        Map<String,Integer> ransomCount = new HashMap<String, Integer>();
	        Map<String,Integer> magazineCount = new HashMap<String, Integer>();
	        boolean ransomPossible = false;
	        
	        for(int i=0;i<ransom.length;i++){
	        	int count =0;	
	        	if(ransomCount.get(ransom[i]) != null){
	        		count = ransomCount.get(ransom[i] );
	        	}	
	        	count++;
	        	ransomCount.put(ransom[i],count );
	        }	
	        
	        for(int i=0;i<magazine.length;i++){
	        	int count =0;	
	        	if(magazineCount.get(magazine[i]) != null){
	        		count = magazineCount.get(magazine[i] );
	        	}	
	        	count++;
	        	magazineCount.put(magazine[i],count );
	        }
	        
	         
	        for(int i=0;i<ransom.length;i++){
	        	
	        	int ranCount = ransomCount.get(ransom[i]);
	        	int magCount = magazineCount.get(ransom[i]);
	        	
	        	if(ranCount<=magCount){
	        		ransomPossible =true;
	        	}else{
	        		ransomPossible =false;
	        		break;	
	        	}
	        }
	        		
	        	

	        if(!ransomPossible){
	        	System.out.println("No");
	        }else{
	        	System.out.println("Yes");
	        }
	}
}
