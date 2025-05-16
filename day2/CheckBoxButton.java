package week3.day2;

public class CheckBoxButton extends Button {
	public void clickCheckButton(){
		System.out.println("Click the check button");
		
	}
	
	//inheriting from the button subclass
	public static void main(String[] args) {
		CheckBoxButton cbb=new CheckBoxButton();
		cbb.click();
		cbb.setText();
		cbb.submit();
		cbb.clickCheckButton();
	}

}
