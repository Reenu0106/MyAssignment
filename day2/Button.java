package week3.day2;

public class Button extends WebElement {
   
	    public void submit() {
	    	System.out.println("submit");
	    }
	    
	    //inheriting from the webelement superclass
	    public static void main(String[] args) {
			Button b=new Button();
			b.click();
			b.setText();
			b.submit();
		}
}
