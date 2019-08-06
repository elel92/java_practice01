package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i = 1; i <= 99; i++) {
			int count = 0;
			
			String[] s = Integer.toString(i).split("");
			
			for(int j = 0; j < s.length; j++) {
				if(Integer.parseInt(s[j]) % 3 == 0 && Integer.parseInt(s[j]) != 0) {
					count++;
				}
			}
			
			if(count == 1) {
				System.out.println(i + " 짝");
			} else if(count == 2) {
				System.out.println(i + " 짝짝");
			}
		}
	}
}
