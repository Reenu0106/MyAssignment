package week3.day2;

public class FlipkartLogin extends TestData{
    
	
    public void enterUsername() {
    	System.out.println("enter the Username");
    }
    
    public void enterPassword() {
    	System.out.println("enter the Password");
    }
    
    // extends from the testdata 
    public static void main(String[] args) {
	FlipkartLogin fl=new FlipkartLogin();
	fl.enterCredentials();
	fl.navigateToHomePage();
	fl.enterUsername();
	fl.enterPassword();
	}
    
}
