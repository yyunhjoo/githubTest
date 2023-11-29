package st01;

import java.util.Random;

public class ex02 {

	public static void main(String[] args) {
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		System.out.println(Math.abs(-30));
		
		/* 문자형 -> 숫자형변환 */
		String str = "100";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		/* 숫자형 -> 문자형변환 */
		String str2 = String.valueOf(i);
		System.out.println(str2);
		
		/* 랜덤 숫자 생성 */
		Random random = new Random();
		int rand = random.nextInt(3); //012
		System.out.println(rand);
	}

}
