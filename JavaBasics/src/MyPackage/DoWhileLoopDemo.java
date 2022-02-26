package MyPackage;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// print 1 to 10		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		// calculate annual percentage
		int[] monthlyMarks = {40,50,60,55,65,42,42,42,43,44,55,66};
		i = 0;
		int sumMarks = 0;
		boolean isPassed = true;
		do {
			int marks = monthlyMarks[i];
			if(marks>=40) {
				isPassed = true;
			}else {
				isPassed = false;
				break;
			}
			sumMarks = sumMarks + marks;
			i++;
		} while (i < monthlyMarks.length && isPassed);
		
		if(!isPassed) {
			System.out.println("Student has failed. No need to calculate percentage");
		}else {
			float avgMarks = (float)sumMarks/monthlyMarks.length;
			System.out.println("Average marks for the year: "+ String.format("%.02f", avgMarks));
		}		

	}

}
