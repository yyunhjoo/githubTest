/*반복문*/
package st01;

public class ex05 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		int i=0;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		//무조건 1번은 실행
		i=0;
		do {
			System.out.print(i);
			i++;
		}while(i<10);
		System.out.println();
		
		/* break */
		for(i=0; i<10; i++) {
			System.out.print(i);
			if(i==5) {
				break;
			}
		}
		System.out.println();
		
		/* continue */
		for(i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
	}
}
