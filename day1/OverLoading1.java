package week4.day1;

public class OverLoading1 extends OverLoading{
	//string value
	public void reportstep(String message1, String status1 ) {
		System.out.println("Message1"+ message1);
		System.out.println("Status1"+ status1);
	}
	//method overloading
	public static void main(String[] args) {
		OverLoading1 ol1=new OverLoading1();
		ol1.reportstep("Message", "Active");
		}}