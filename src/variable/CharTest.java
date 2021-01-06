package variable;

public class CharTest {

	public static void main(String[] args) {
		
		// ctrl + space 하면 항목 지정
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		
		int iCh = 66;
		
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		char hangul = '\uAC00'; // 한글 ASCII
		
		System.out.println(hangul);
		
		char hangul2 = '한'; // 그냥 한글로 써도 됨
		
		System.out.println(hangul2);
		
	}
}
