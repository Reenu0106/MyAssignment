package week3.day1;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int input[]= {1,4,3,2,8,6,7};
		
		//sorting the input
		Arrays.sort(input);
		System.out.println(input[4]+ " sortnumber");
		
		//arraylength
		int arraylength=input.length;
		System.out.println(arraylength+ " arraylength");
		
		//maxvalue
		int maxvalue= input[arraylength-1];
		System.out.println(maxvalue+ " maxvalue");
		
		//int sum= 0;
		
		//for loop
		for (int i = 0; i < input.length; i++) {
			i = i + 1;
			if (i!=input[i-1]) {
				System.out.println(i+ " missingnumber");
				break;
				}
			
			}	
			
			
			
			//sum = sum+input[i];
		   //System.out.println(sum+ " sum");
		  //int missingnum=(maxvalue*(maxvalue+1)/2)-sum;
		  //System.out.println(missingnum+ " missingnumber");
			
		}
	}


