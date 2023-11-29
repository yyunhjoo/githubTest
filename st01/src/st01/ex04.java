/*조건문*/
package st01;

public class ex04 {

	public static void main(String[] args) {
		int i = 4;
		if(i<5) {
			System.out.println("참");
		}else if(i<3) {
			System.out.println("거짓");
		}else {
			System.out.println("나머지");
		}
		
		
		boolean isMarried = true;
		String str;
		
		str = isMarried ? "결혼 했다" : "결혼 안했다";
		
		if(isMarried) {
			str = "결혼 했다";
		}else {
			str = "결혼 안했다";
		}
		
		
		switch(str) {
			case "결혼 했다":
				System.out.println("0");
				break;
			case "결혼 안했다":
				System.out.println("1");
				break;
			default:
				System.out.println("2");
		}
		
		System.out.println(str);
		
	}

}
