package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
	public static void main(String[] args) {
		//String[] name= {"HCL,Wipro,Aspire Systems,CTS"};
		List<String> companies=new ArrayList<String>();
		companies.add("HCL");
		companies.add("Wipro");
		companies.add("Aspire Systems");
		companies.add("CTS");
		System.out.println(companies);
		Collections.sort(companies,Collections.reverseOrder());
		//for (int i = name.length; i >=0; i--) {
			System.out.println(companies);
			}}