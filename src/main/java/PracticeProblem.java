import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		Boolean bool1 = input.nextBoolean();
		System.out.println(bool1);

	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: " );
		int int2 = input.nextInt();	

		Boolean bool1 = int2 > 5;
			//int2 = true;
			System.out.println(bool1);
			
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input pizza: ");
		String inp3 = input.nextLine();
		System.out.println(inp3.equals("pizza"));

	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: " );
		double inp4 = input.nextDouble();
		System.out.println(inp4 == 0);

	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: " );
		Integer inp5 = input.nextInt(); 
		Integer zero = 0;
		boolean bool5 = inp5 != zero;
		System.out.println(bool5);


	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word earlier than google: " );
		String inp6 = input.nextLine().strip();
		System.out.println(inp6.compareTo("google") < 0);

	}

}
