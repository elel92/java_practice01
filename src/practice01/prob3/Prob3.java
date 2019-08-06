package practice01.prob3;

import java.util.*;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		int answer = 0;
		
		if(input % 2 == 0) {
			for(int i = 0; i <= input; i=i+2) {
				answer += i;
			}
		} else {
			for(int i = 1; i <= input; i=i+2) {
				answer += i;
			}
		}
		
		System.out.println("결과 값 : " + answer);
	}
}
