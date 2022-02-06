package MyPackage;

public class ArraysDemo {

	public static void main(String[] args) {
		
		String[] subjects = {"Science", "Maths"};
		
		// display array values
		System.out.println(subjects[1]);
		
		int[] quarterMarks = new int[4];
		quarterMarks[0] = 51;
		quarterMarks[1] = 42;
		quarterMarks[2] = 33;
		quarterMarks[3] = 61;
		
		System.out.println("3rd Quarter marks "+ quarterMarks[2]);
		
		int totalQuarters = quarterMarks.length;
		
		float avgMarks = (quarterMarks[0] + quarterMarks[1] + quarterMarks[2] + quarterMarks[3])/totalQuarters;
		System.out.println("Average Marks: "+ avgMarks);
		
		int[][] subjectWiseMarks = {{30,20,25,33},{23,55,33,55}};
		System.out.println("Marks for 2nd subject and 3rd quarter:"+  subjectWiseMarks[1][2]);
		
		//display all the values
		System.out.println(subjectWiseMarks[0][0]);
		System.out.println(subjectWiseMarks[0][1]);
		System.out.println(subjectWiseMarks[0][2]);
		System.out.println(subjectWiseMarks[0][3]);
		System.out.println(subjectWiseMarks[1][0]);
		System.out.println(subjectWiseMarks[1][1]);
		System.out.println(subjectWiseMarks[1][2]);
		System.out.println(subjectWiseMarks[1][3]);
		
		
		
		
		
		

	}

}
