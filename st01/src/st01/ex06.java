/*배열*/
package st01;

import java.util.ArrayList;

public class ex06 {

	public static void main(String[] args) {
		int[] score= new int[5]; //길이 5개의 배열 생성.
		int count = score.length;
		System.out.println(count); //배열의길이
		
		score[0] = 10;
		System.out.println(score[0]);
		System.out.println(score[1]);
		
		int[] score2 = {1,2,3,4,5};
		System.out.println(score2.length-1);
		
		//String은 초기화를 해주지 않을 시, 0이 아닌 null값 출력.
		String[] names = new String[2];
		System.out.println(names[0]);
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		scoreList.add(2, 200);
		scoreList.remove(2);
		System.out.println(scoreList.size());
		System.out.println(scoreList.get(1)); //20
	}

}
