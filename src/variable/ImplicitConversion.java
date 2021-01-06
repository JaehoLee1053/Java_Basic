package variable;

public class ImplicitConversion {

	public static void main(String args[]) {
		
		byte bNum = 10;
		int iNum = bNum;

		 System.out.println(bNum);
		System.out.println(iNum);
		
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum); // 실수가 가장 큰 단위이기 때문에 문제 없음
		
		
		double dNum;
		dNum = (fNum + iNum); // 정수가 실수형으로 바뀐 후 더해짐
		
		System.out.println(dNum);
		
	}
	
}
