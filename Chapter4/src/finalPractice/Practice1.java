package finalPractice;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char chOperator = (char) sc.next().charAt(0);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = 0;

		if (chOperator == '+') {
			res = num1 + num2;
		} else if (chOperator == '-') {
			res = num1 - num2;
		} else if (chOperator == '*') {
			res = num1 * num2;
		} else if (chOperator == '/') {
			res = num1 / num2;
		}

		System.out.println("For : " + res);

		switch (chOperator) {
		case '+':
			res = num1 + num2;
			
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		}
		
		System.out.println("Switch case : " + res);

	}

}
