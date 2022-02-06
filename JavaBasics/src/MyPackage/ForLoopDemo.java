package MyPackage;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//for(initialization, condition, increment/decrement)
		//Display 1 to 10
		System.out.println("Display 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// calculate annual percentage
		int[] monthlyMarks = {40,50,60,55,65,35,42,32,43,44,55,66};
		int sumMarks = 0;
		
		for (int marks : monthlyMarks) {
			sumMarks = sumMarks + marks;
		}
		
		float avgMarks = (float)sumMarks/monthlyMarks.length;
		System.out.println("Average marks for the year: "+ String.format("%.02f", avgMarks));
		
		// Calculate % for the first 6 months
		sumMarks = 0;
		for (int i = 0; i < 6; i++) {
			sumMarks = sumMarks + monthlyMarks[i];
		}
		avgMarks = (float)sumMarks/6;
		System.out.println("Average marks for the first 6 months: "+ String.format("%.02f", avgMarks));
		
		//Display subjectwise marks
		int[][] subjectWiseMarks = {{30,20,25,33,22,55,44},{23,55,33,55,33,44,55}};		
		System.out.println("Display subjectwise marks");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(subjectWiseMarks[i][j]);
			}			
		}
		
		
		
		

	}

}
