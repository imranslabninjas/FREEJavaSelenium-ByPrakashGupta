package MyPackage;

public class Employee {
	
	//State
	int empId;
	String employeeName;
	int age;
	double salary;
	float currentExperience, totalExperience;	
	static int totalEmployees;  // Class/Global variable
	
	//Constructor	
	public Employee(String employeeName) {
		this.employeeName = employeeName;
		totalEmployees++; // increment by 1
	}
	
	public Employee(String employeeName, int age, float totalExperience) {
		this.employeeName = employeeName;
		this.age = age;
		this.totalExperience = totalExperience;
		totalEmployees++; // increment by 1
	}
	
	public static int getTotalEmployees() {
		return totalEmployees;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public float getCurrentExperience() {
		return currentExperience;
	}
	public float getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(float totalExperience) {
		this.totalExperience = totalExperience;
	}
		
	//Behaviour	
	public double calculateSalary(float totalExperience) {
		return totalExperience*100000;
	} 
	
	public boolean salaryRaiseEligibility() {
		boolean isEligibleForRaise;
		if(currentExperience > 1)
			isEligibleForRaise = true;
		else
			isEligibleForRaise = false;
		return isEligibleForRaise;
	}
	
	void increaseSalaryAnnually() {
		salary = salary + salary*0.1;
	}
	
	// It should be written outside the class from wherever you are using Employee class
	public static void main(String[] args) {
		Employee employee1 = new Employee("Employee 1", 25, 5);
		Employee employee2 = new Employee("Employee 2");
		employee2.setAge(30);
		employee2.setTotalExperience(8);
		
		System.out.println("Total Employees: "+ Employee.getTotalEmployees());
		
		System.out.println("Employee1 name: "+ employee1.getName());
		System.out.println("Employee2 name: "+ employee2.getName());
		
		// calculate their salaries
		System.out.println("Employee1 salary: "+ employee1.calculateSalary(employee1.getTotalExperience()));
		System.out.println("Employee2 salary: "+ employee2.calculateSalary(employee2.getTotalExperience()));
		
		
	}

}
