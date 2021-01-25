package array;

public class Practice {

	public static void main(String[] args) {
	
		char[] cArr = new char[26];
		
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = (char)('A'+i);
		}
		
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
	}
	
}
