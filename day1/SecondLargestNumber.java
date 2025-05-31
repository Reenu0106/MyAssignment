package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	public static void main(String[] args) {
		//integer value
		Integer[] number= {3,2,11,4,6,7};
		//syntax for list
		List<Integer>sl=Arrays.asList(number);
		//sort in ascending order
		Collections.sort(sl);
		System.out.println("ascending order:"+ sl);
		//to find second largest number
		Integer secondlargestnumber = sl.get(sl.size()-2);
		System.out.println("Second largest number is "+ secondlargestnumber);
	}}