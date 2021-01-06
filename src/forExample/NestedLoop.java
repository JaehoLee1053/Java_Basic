package forExample;

public class NestedLoop {

	public static void main(String[] args) {

		int dan;
		int count;

		for (dan = 2; dan <= 9; dan++) {
			for (count = 1; count <= 9; count++) {
				System.out.print(dan + " X " + count + " = " + dan * count + "\t");
			}
			System.out.println();
		}

		dan = 2;

		while (dan <= 9) {
			count = 1;
			while (count <= 9) {
				System.out.print(dan + " X " + count + " = " + dan * count + "\t");
				count++;
			}
			dan++;
			System.out.println();
		}

	}

}
