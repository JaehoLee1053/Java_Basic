package temp;

public class Temp {
	public static void main(String[] args) {
		int init = 13;
		for (int i = 0; i < 20; i++) {
			int val = init + 4 * i;
			System.out.print(val + ":" + val + ", ");
		}
	}
}
