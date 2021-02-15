package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';

		System.out.println(ch);
		System.out.println((int)ch); // type casting : 강제 형변환
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		char hangul = '\uAC00'; // u는 유니코드 표시
		System.out.println(hangul);

	}

}
