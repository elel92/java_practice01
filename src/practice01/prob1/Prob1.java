package practice01.prob1;

import java.util.*;

public class Prob1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오 : ");
		int i = sc.nextInt();
		
		if(i % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		sc.close();
	}
}
