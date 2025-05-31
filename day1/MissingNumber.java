package week4.day1;

import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class MissingNumber {
	public static void main(String[] args) {
		Integer[] number= {1,2,3,4,10,6,8};
		//syntax for list
		List<Integer> missingnumber=Arrays.asList(number);
		//sort the list in ascending order
		Collections.sort(missingnumber);
		System.out.println("ascending order: "+ missingnumber);
		for (int i = 0; i < missingnumber.size()-1; i++) {
				//get method is used to get element from the list
			if (missingnumber.get(i)+1!=missingnumber.get(i+1)) {
              for (int j = missingnumber.get(i)+1; j < missingnumber.get(i+1); j++) {
	            System.out.println(j);}
            }
		}
	}
}