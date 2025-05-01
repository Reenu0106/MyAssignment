package week1.day2;

public class Library {
	// method syntax
	public String addBook (String bookTitle) {
    System.out.println("Book added successfully");
	return bookTitle;
	}
			
	public void issueBook() {
		System.out.println("Book issued successfully");
				
	}
	
	public static void main(String[] args) {
		// object syntax className object=new className
		
	Library book=new Library();
	String bt=book.addBook("Alphabet");
	System.out.println(bt);
	book.issueBook();
	}
}
