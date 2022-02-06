package MyPackage;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		// calculate annual percentage
		int[] monthlyMarks = {40,50,60,55,65,42,42,32,43,44,55,66};
		
		int i = 0;
		int sumMarks = 0;
		boolean isPassed = true;
		while (i < monthlyMarks.length && isPassed) {
			int marks = monthlyMarks[i];
			if(marks>=40) {
				isPassed = true;
			}else {
				isPassed = false;
				break;
			}
			sumMarks = sumMarks + monthlyMarks[i];
			i++;
		}
		
		if(!isPassed) {
			System.out.println("Student has failed. No need to calculate percentage");
		}else {
			float avgMarks = (float)sumMarks/monthlyMarks.length;
			System.out.println("Average marks for the year: "+ String.format("%.02f", avgMarks));
		}		

	}

}
