package week3.day2;

public class FacebookLogin extends TestData{
	
	public void enterUsername() {
		System.out.println("enter the username");
	}
	
	public void enterPassord() {
		System.out.println("enter the password");
	}
	 
	//data extends from the testdata
	public static void main(String[] args) {
		FacebookLogin fb=new FacebookLogin();
		fb.enterCredentials();
		fb.navigateToHomePage();
		fb.enterUsername();
		fb.enterPassord();
		
	}

}
