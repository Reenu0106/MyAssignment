package week3.day1;

public class DuplicateWords {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		
		
		String[] count=text.split(" ");
		System.out.println(count[0]);
		
		//for loop
		for (int i = 0; i < count.length; i++) {
		if(count[i]!=" "){
			
			//for loop
			for (int j = i+1; j < count.length; j++) {
		    if(count[i].equals(count[j])) {
				count[i]="  ";
				count[j]="  ";
				}
			}
			}}
		 //for loop
		for (int k = 0; k < count.length; k++) {
		if(count[k]!=" ") {
		System.out.print(count[k]+" ");
		}
	}
}}