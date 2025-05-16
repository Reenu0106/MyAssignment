package week3.day2;

public class JavaDatabaseConnection3 extends JavaDatabaseConnection2{

	
	public void connect() {
		System.out.println("connected to the database");
	}

	public void disconnect() {
		System.out.println("disconnected to the database");
    }

	public void executeUpdate() {
 	    System.out.println("execute the update");
 	}

	public void createastatement() {
		System.out.println("create a statement");
	} 
	
	public static void main(String[] args) {
		JavaDatabaseConnection3 jc3=new JavaDatabaseConnection3();
				jc3.connect();
		        jc3.disconnect();
		        jc3.executeUpdate();
		        jc3.createastatement();
	}

}
