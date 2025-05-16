package week3.day2;

public class JavaDatabaseConnection1 implements DatabaseConnection {

	public void connect() {
		System.out.println("connected to the database");
	}
	
	public void loadthedriver() {
		System.out.println("driver is loaded");
	}

	public void disconnect() {
		System.out.println("disconnected to the database");
	}

	public void executeUpdate() {
 	    System.out.println("execute the update");
	}
	
	public static void main(String[] args) {
		JavaDatabaseConnection1 jc=new JavaDatabaseConnection1();
		jc.connect();
		jc.loadthedriver();
		jc.disconnect();
		jc.executeUpdate();
		
	}

}
