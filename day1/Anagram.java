package week3.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
	
	String text1="stops";
	String text2="potss";
	//find the length
	int length1=text1.length();
	System.out.println(length1+ " The lenght of text1");
	int length2=text2.length();
	System.out.println(length2+ " The length of text2");
	
	//if else condition
	if (length1==length2) {
	     System.out.println("length is equal");
	     
	     char[] charArray1= text1.toCharArray();
         System.out.println(charArray1);
         
         char[] charArray2=text2.toCharArray();
         System.out.println(charArray2);
         
         //sort the array
         Arrays.sort(charArray1);
         System.out.println(charArray1);
         
         Arrays.sort(charArray2);
         System.out.println(charArray2);
         
         //if else condition
         if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are Anagram");
		 } 
		 else {
            System.out.println("The given strings are not Anagram");
		 }
	}
	else {
	     System.out.println("length is not equal");
	}
}
}