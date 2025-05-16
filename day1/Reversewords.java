package week3.day1;

public class Reversewords {
	public static void main(String[] args) {
		String test="I am a software tester";
		
		//split the string 
		String[] split=test.split(" ");
		
		//for loop
		for (int i = 0; i < split.length; i++) {
		//if loop	
		if (i%2!=0) {
        for (int j =split[i].length()-1;j>=0; j--) {
		System.out.print(split[i].charAt(j)+ "");
	    }
	            System.out.print(" ");
	
}
		else {
				System.out.print(split[i]+ " ");
			}
	
		}
	}
}


