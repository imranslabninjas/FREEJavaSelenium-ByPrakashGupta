package MyPackage;

public class ElseIfDemo {

	public static void main(String[] args) {
		int percentage = Integer.parseInt(args[0]) ;
		boolean isPassed = false;
		char grade;
		
		// find out whether the student is passed or not
		//if percentage > 40  then pass else fail
		if (percentage >= 40) {
			isPassed = true;
			System.out.println("Student passed");
			//calculate grades
			if(percentage>=40 && percentage <60) {
				grade = 'C';
			}else if (percentage>=60 && percentage <80) {
				grade = 'B';
			}else {
				grade = 'A';
			}
			System.out.println("Student Grade: "+ grade);
			
		}
		else {
			isPassed = false;
			System.out.println("Student failed");
		}

	}

}
