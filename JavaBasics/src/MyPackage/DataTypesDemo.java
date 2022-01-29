package MyPackage;

public class DataTypesDemo {
	
	public static void main(String[] args) {
		int rollNumber = 2;
		String name = "xyz";
		float percentage = 45.33f;
		char grade = 'A';
		boolean isPassed = false;
		
		System.out.println("roll No: " + rollNumber);
		System.out.println("Student name: "+name);
		System.out.println("percentage: "+ percentage);
		System.out.println("grade: "+grade);
		System.out.println("passed: "+ isPassed);
		
		//type casting
		int percentageInt = (int)percentage;
		System.out.println("percentage after type casting into int"+ percentageInt);
		
		String num  = "10";
		System.out.println("Valid type conversion: "+ Integer.parseInt(num));
		System.out.println("Invalid type conversion: "+ Integer.parseInt(name));
		System.out.println();
	}

}
