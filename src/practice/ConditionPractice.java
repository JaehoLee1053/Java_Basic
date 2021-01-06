package practice;

import java.util.*;

public class ConditionPractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char operator = '+';
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println();
		System.out.println("If Statement");
		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Error: Wrong Operator");
		}

		System.out.println();
		System.out.println("Switch Case Statement");

		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Error: Wrong Operator");
		}

	}

}
