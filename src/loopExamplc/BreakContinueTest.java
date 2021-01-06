package loopExamplc;

public class BreakContinueTest {

	public static void main(String[] args) {

		int dan;
		int count;

		for (dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0)
				continue;
			for (count = 1; count <= 9; count++) {
				System.out.print(dan + " X " + count + " = " + dan * count + "\t");
				if (count >= dan)
					break;
			}
			System.out.println();
		}

	}

}
