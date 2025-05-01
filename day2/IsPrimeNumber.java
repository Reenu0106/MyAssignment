package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=87;
		boolean ifprime=true;
		
		// for loop 
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
		    ifprime=false;
				break;
			}
		}
		
		//if else statement
		if(ifprime)	{
			System.out.println("its a prime");
		}else {
				System.out.println("its not a prime");
			}
		
		}
		
	}	
