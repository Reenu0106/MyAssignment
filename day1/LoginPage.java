package week4.day1;

public class LoginPage extends BasePage {
	public void performcommonTasks(){
		System.out.println("performcommonTasks");}
	//calls both super class and subclass
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		BasePage bp=new BasePage();
		lp.performcommonTasks();
		bp.clickElement();
		bp.enterText();
		bp.findElement();
	}}