package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		//string array
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		//syntax for list
		List<Integer> commonvalues=new ArrayList<Integer>();
		//iterate the list of values
		for (int i = 0; i < a.length; i++) {
			//for loop and if conditions for equals
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					commonvalues.add(a[i]);}
			}
		} 
		System.out.println("The equal values are"+commonvalues);}
		}