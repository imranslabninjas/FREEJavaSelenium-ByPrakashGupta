package MyPackage;

public class Employee {
	
	//State
	int empId;
	String name;
	int age;
	double salary;
	float currentExperience, totalExperience;	
	
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
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
		
	//Behaviour
	
	public double calculateSalary(float totalExperience) {
		return totalExperience*100000;
	} 
	
	public boolean salaryRaiseEligibility() {
		if(currentExperience > 1)
			return true;
		else
			return false;
	}
	
	void increaseSalaryAnnually() {
		salary = salary + salary*0.1;
	}
	
	// It should be written outside the class from wherever you are using Employee class
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		
	}

}
