package switchCase;

import java.util.*;

public class SwitchCasePractice {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();
		int day;
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2: case 4: case 6: case 9: case 11:
				day = 28;
				break;
			default:
				day = 0;
				System.out.println("Error");
		}
		
		System.out.println(month +"월은 "+ day + "까지 있습니다.");

	}

}
