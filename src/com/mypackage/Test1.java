package com.mypackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
	
	public static Map<String, Integer> countOccurences(String s){
		String[] input=s.split("\\s");
		
		Map<String, Integer> result=new HashMap<>();
		
		for(String in:input) {
			String curr=in.toLowerCase();
			if(result.containsKey(curr)) {
				result.put(curr, result.get(curr)+1);
			}else {
				result.put(curr, 1);
			}
		}
		return result;
	}
	public static String sortData(String str) {
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
	}
	
	public static boolean shuffleCHeck(String s1,String s2,String s3) {
		s1=sortData(s1);
		s2=sortData(s2);
		s3=sortData(s3);
		int i=0,j=0,k=0;
		while(k!=s3.length()) {
			
			if(i<s1.length() && s1.charAt(i)==s3.charAt(k)) {
				i++;
			}else if(j<s2.length() && s2.charAt(j)==s3.charAt(k)) {
				j++;
			}else {
				return false;
			}
			k++;
			
		}
		
		if(i<s1.length() || j<s2.length()) {
			return false;
		}
		return true;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s="the Dog and The other dog";
		countOccurences(s).forEach((k,v)->System.out.println(k+" "+v));*/
		
		System.out.println(shuffleCHeck("abc", "def", "abedfc"));
		
		
		

	}

}
