package employees;

public class Accountant extends Employee {

	private String book;
	
	public Accountant(String name, int age, double salary, String department, String book) {
		super(name, age, salary, department);
		this.setBook(book);
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
	
	public String toString() {
        return super.toString() + "\nBook: " + this.book + "\n";
    }

}
