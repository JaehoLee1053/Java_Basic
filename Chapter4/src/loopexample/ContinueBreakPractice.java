package loopexample;

public class ContinueBreakPractice {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j % 2 == 0 && j >= i)
					System.out.print(j + " X " + i + " = " + (i * j) + "\t");
				else
					System.out.println("\t\t");

			}

			System.out.println();

		}

	}

}
