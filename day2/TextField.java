package week3.day2;

public class TextField extends WebElement{
	public void getdata() {
	String cinematitle="movie";
	System.out.println(cinematitle);
	}
	
	//extends from the webelement
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.click();
		tf.setText();
		tf.getdata();
	}
}
