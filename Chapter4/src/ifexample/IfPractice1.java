package ifexample;

import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		char grade;

		if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else {
			grade = 'A';
		}

		System.out.println("Score : " + score + "\n"
				+ "Grade : " + grade);

	}

}
