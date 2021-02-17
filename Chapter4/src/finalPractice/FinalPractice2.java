package finalPractice;

import java.util.Scanner;

public class FinalPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			if (i < n / 2) {

				for (int j = i; j < n / 2; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < 2 * i + 1; j++) {

					System.out.print('*');

				}

			} else {

				for (int j = i - n / 2; j > 0; j--) {
					System.out.print(" ");
				}

				for (int j = 2 * (n - i) - 1; j > 0; j--) {

					System.out.print('*');

				}

			}

			System.out.println();

		}

	}

}
