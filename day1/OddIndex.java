package week3.day1;

public class OddIndex {
	public static void main(String[] args) {
		String test="changeme";
		
		//length of the string
		int length=test.length();
		System.out.println(length);
		
		//convert to array
		char[] charArray=test.toCharArray();
		System.out.println(charArray);
		
		//for loop
		for (int  i= charArray.length-1; i>=0 ; i--) {
		    char str=test.charAt(i);
		  if (i%2==0) {
		    	System.out.println(Character.toLowerCase(str));
				
			} else {
				System.out.println(Character.toUpperCase(str));

			}
			
		}
			
	}
}


