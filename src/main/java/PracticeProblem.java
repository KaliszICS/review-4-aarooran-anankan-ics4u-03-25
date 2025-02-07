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
		//Write question 1 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = in.nextLine();
		num = (5 + num);
		int num2 = Integer.parseInt(num);
		System.out.println(num2 + 5);

	}

	public static void q2() {
		//Write question 2 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = in.nextLine();
		num = (4 + num + 3);
		double num2 = Double.parseDouble(num);
		System.out.println(num2 + 3.4);

	}

	public static void q3() {
		//Write question 3 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String word = in.nextLine();
		boolean word2 = Boolean.parseBoolean(word);
		System.out.println(!word2);
	}

	public static void q4() {
		//Write question 4 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = in.nextLine();
		num = (num + 3);
		int num2 = Integer.parseInt(num);
		num2 = (num2 + 2);
		System.out.println((char)num2);

	}

	public static void q5() {
		//Write question 5 code here
		
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = in.nextLine();
		num = (num + 1);
		int num2 = Integer.parseInt(num);
		System.out.println((double)(num2/2));
	}

	public static void q6() {
		//Write question 6 code here
		
	}

}
