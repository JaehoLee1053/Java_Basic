package switchCase;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int rank = scanner.nextInt();
		char medalColor;

		switch (rank) {
		case 1:
			medalColor = 'G';
			break; // braek 안 쓰면 뒤까지 이어서 쭉 진행됨
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
		}

		System.out.println(rank + "등은 " + medalColor + "메달");

	}

}
