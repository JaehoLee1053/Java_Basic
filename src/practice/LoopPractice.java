package practice;

import java.util.*;

public class LoopPractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			if (i < num / 2) {
				for (int j = 0; j < num / 2 - i; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < i * 2 + 1; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 0; j < i - num / 2; j++) {
					System.out.print(' ');
				}
				for (int j = 0; j < num * 2 - 1 - i * 2; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

}
