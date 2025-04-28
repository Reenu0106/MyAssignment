package week1.day2;

public class LibraryManagement {
	public static void main(String[] args) {
		Library book1=new Library();
		String bt=book1.addBook("StoryBook");
		System.out.println(bt);
		book1.issueBook();
		
	}

}
