package week4.day1;

public class OverLoading {
	//String value 
	public void reportStep(String message, String status) {
		System.out.println( "Message"+ message);
		System.out.println( "Status"+ status);
		}
	//same method name with string values	
	public void reportStep(String message, String status, boolean snap) {
		System.out.println("Message" + message);
		System.out.println("Status"+ status);
		System.out.println("snapshot "+ snap);
		}
	//method overloading
	public static void main(String[] args) {
		OverLoading ol=new OverLoading();
		ol.reportStep(" message", " active");
		ol.reportStep(" message", " active", true);
	}}