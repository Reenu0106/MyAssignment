package week1.day2;

public class Palindrome {  
	public static void main(String[] args) {
		int input=121;
		int output=input;
		int rem=0;
		// for loop statement
		for (int i=input; i>0;i/=10) {
			
		int dig=i%10;
		rem=rem*10+dig;
        System.out.println("reverse number is " +rem);
			
		}
		
		
	//if else condition 
		if (output==rem) 
		{	
				System.out.println("input number is palindrome");
				
			}
		else 
		{
                System.out.println("input number is not palindrome");
			}
		
}}	
			
		
			
		
		
		

	



