package ifexample;

import java.util.Scanner;

public class SwitchCasePractice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			day = 31;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			day = 30;
		}
		case 2: {
			day = 28;
		}
			System.out.println(month + "월은 " + day + "일까지 있습니다.");
			break;
		default: {
			System.out.println("Error");
		}
		}

	}

}
