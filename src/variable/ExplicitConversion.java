package variable;

public class ExplicitConversion {

	public static void main(String args[]) {
		
		int i = 1000;
		byte bNum = (byte)i; // 작은 크기로 대입하면 데이터 유실 가능성
		
		System.out.println(bNum);
		
		
		double dNum = 1.2;
		float fNum = 0.9F;

		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);

		System.out.println(iNum1);
		System.out.println(iNum2);
		
	}
	
}
