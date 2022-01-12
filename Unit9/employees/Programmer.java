package employees;

public class Programmer extends Employee {

	private String language;
    
    public Programmer(String name, int age, double salary, String department, String language) {
        super(name, age, salary, department);
        this.language = language;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String toString() {
        return super.toString() + "\nLanguage: " + this.language + "\n";
    }
}
