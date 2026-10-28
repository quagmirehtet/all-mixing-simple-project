package Test;

import java.util.*;

public class Main {

	public static double sum(double num1, double num2) {

		return num1 + num2;

	}

	public static double sub(double num1, double num2) {

		return num1 - num2;

	}

	public static double multi(double num1, double num2) {

		return num1 * num2;

	}

	public static double div(double num1, double num2) {

		return num1 / num2;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double result = 0.0;

		boolean flag = true;

		while (flag) {

			System.out.println("============ Simple Calculator ===========");

			System.out.print("Enter arithmetic operator option 1.'+'  2.'-' 3. '*'  4. '/' 5.exit : ");
			int arithmeticOperator = scanner.nextInt();
			scanner.nextLine();
			
			if(arithmeticOperator==5) {
				
				System.out.println("Program exit");
				
				return;
				
			}

			System.out.print("Enter number 1 : ");
			double num1 = scanner.nextDouble();

			System.out.print("Enter number 2 :");
			double num2 = scanner.nextDouble();

			switch (arithmeticOperator) {

			case 1:

				result = sum(num1, num2);

				System.out.println(result);
				break;

			case 2:

				result = sub(num1, num2);
				System.out.println(result);
				break;

			case 3:

				result = multi(num1, num2);
				System.out.println(result);
				break;

			case 4:

				result = div(num1, num2);
				System.out.println(result);
				break;

			case 5:

				System.out.println("Program exit.");
				flag = false;

			default:
				System.out.println("Invalid Input");

			}
		}

	}

}
