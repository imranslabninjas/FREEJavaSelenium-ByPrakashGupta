package MyPackage;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a = 10;
		
		//Unary Operators
		System.out.println("postfix: "+ a++);  
		System.out.println("after postfix: "+ a);  
		System.out.println("prefix: "+ ++a);  
		
		// Negate expression
		boolean bool1 = true;
		System.out.println("Not operator: " + !bool1 );
		System.out.println("Negaate: "+ ~10);
		
		// Arithmatic operations
		
		a = 13;
		int b = 2;
		System.out.println("Addition: "+ (a+b));
		System.out.println("Subtraction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Mod: "+ (a%b));
		
		//Relational
		System.out.println(">="+ (a>=b));
		System.out.println("<="+ (a<=b));
		System.out.println("=="+ (a==b));
		System.out.println("!="+ (a!=b));
		
		//Logical
		
		System.out.println("&&"+ ((a>b) && (a>0)));   // a>b and a is not a -ve number
		System.out.println("||"+ ((a>b) || (a>0)));
		
		System.out.println("increment by 10" + (a+=10));
		
		
		

	}

}
