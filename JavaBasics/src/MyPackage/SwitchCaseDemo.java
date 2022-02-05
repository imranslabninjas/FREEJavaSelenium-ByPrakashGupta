package MyPackage;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		String grade = args[0];

		switch (grade) {
		case "A": {
			System.out.println("Percentage are between 80 to 100");
		}
		case "B": {
			System.out.println("Percentage are between 60 to 80");
		}
		case "C": {
			System.out.println("Percentage are between 40 to 60");
		}
		default:
			System.out.println("Student failed");
		}

	}

}
