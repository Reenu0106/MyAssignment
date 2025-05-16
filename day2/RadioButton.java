package week3.day2;

public class RadioButton extends Button {
	public void SelectRadioButton() {
		System.out.println("select the Radio Button");
	}
	
	//extends from the button subclass
	public static void main(String[] args) {
		RadioButton rb=new RadioButton();
		rb.click();
		rb.setText();
		rb.submit();
		rb.SelectRadioButton();
	}

}
