package employees;

public class Employee {

	private static int numOfEmployees = 0;
	private static int allid = 0000;
	private String name;
    private int age;
    private int id;
    private double salary;
    private String department;
    
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.id = allid + 1;
        allid+=1;
        this.salary = salary;
        this.department = department;
        numOfEmployees++;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    //create toString method

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Id: " + id + "\n"
                + "Salary: " + salary + "\n"
                + "Department: " + department;
    }

	public static int getNumOfEmployees() {
		return numOfEmployees;
	}

	public static void setNumOfEmployees(int numOfEmployees) {
		Employee.numOfEmployees = numOfEmployees;
	}
	
}
