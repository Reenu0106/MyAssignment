package week3.day1;

public class CompareArrays {
	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		//for loop for int a
		for (int i = 0; i < a.length; i++) {
			//for loop for int b
			for (int j = 0; j < b.length; j++) {
				//if statement 
				if (a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
			
		}
		}
		
		
	}


