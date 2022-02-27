package MyPackage;

public class FunctionsDemo {
	
	
	static float calculatePercentage(int[] monthlyMarks){
		int sumMarks = 0;		
		for (int marks : monthlyMarks) {
			sumMarks = sumMarks + marks;
		}		
		float percentage = (float)sumMarks/monthlyMarks.length;
		return percentage;
	}
	
	static boolean isStudentPassed(float percentage){
		if(percentage > 40)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		
		
		// calculate annual percentage
		int[] monthlyMarksStudent1 = {40,50,60,55,65,35,42,32,43,44,55,66};
		int[] monthlyMarksStudent2 = {40,50,62,55,65,33,42,37,43,44,55,66};
		int[] monthlyMarksStudent3 = {40,55,67,55,68,35,42,32,42,44,55,66};
		int[] monthlyMarksStudent4 = {45,50,62,55,65,33,42,37,43,44,55,66};

		System.out.println("Student1 percentage: " + calculatePercentage(monthlyMarksStudent1));
		System.out.println("Student2 percentage: " + calculatePercentage(monthlyMarksStudent2));
		System.out.println("Student3 percentage: " + calculatePercentage(monthlyMarksStudent3));
		System.out.println("Student4 percentage: " + calculatePercentage(monthlyMarksStudent4));
		
		System.out.println("Student1 passed? " + isStudentPassed(calculatePercentage(monthlyMarksStudent1)));
		System.out.println("Student2 passed? " + isStudentPassed(calculatePercentage(monthlyMarksStudent2)));
		System.out.println("Student3 passed? " + isStudentPassed(calculatePercentage(monthlyMarksStudent3)));
		System.out.println("Student4 passed? " + isStudentPassed(calculatePercentage(monthlyMarksStudent4)));
		
			

	}

}
