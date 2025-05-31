package week4.day1;

public class APIClient {
	//methods as a single argument
	public void sendRequest(String endpoint) {
		System.out.println("endpoint"+ endpoint);
	}
	//Same method name with three arguments
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("endpoint"+ endpoint);
		System.out.println("requestBody"+ requestBody);
		System.out.println("requesttatus "+ requestStatus);
	}
	//main method object is created
	public static void main(String[] args) {
		APIClient ac=new APIClient();
		ac.sendRequest(" endpoint1");
		ac.sendRequest(" endpoint2", " requestbody",  false);}
	}