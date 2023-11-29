package st01;

public class ex01 {
	public static void main(String[] args) {
		/* 출력문 */
		System.out.println("HelloWorld");
		System.out.println(30);
		System.out.println(30+35);
		
		System.out.println("==========");
		
		int x = 40;
		System.out.println(x);
		final int y = 20;
		//y = 30;
		//final값을 변경하려고 할 경우 오류 발생.
		System.out.println(y);
		
		/* 숫자형태 */
		int num1 = 30;
		long num2 = 30L;
		short num3 = 30;
		byte num4 = 30;
		
		double numd1 = 30.0;
		double numd2 = 30;
		float numf = 30.0f;
		
		boolean isMarried = true;
		isMarried = false;
		
		System.out.println("==========");

		/* 문자형태 */
		char c = 'a';
		char cc = '한';
		String str =  "여러 글자";
		
		int i = (int)30L;
		numf = (float)numd1; //강제형변환
		
		System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "윤현종", 27, 181.5f);
	}
}
