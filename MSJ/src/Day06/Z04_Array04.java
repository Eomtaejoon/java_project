package Day06;

public class Z04_Array04 {
	public static void main(String[] args) {
		
		int[] score = new int[100];
		int sum1 = 0, sum2 = 0;
		
		for(int i=0; i<100; i++) {
			
			score[i] = i+1;
			
			if( score[i]%2 == 0) //�迭�� �������� ¦���� �͸� 
				sum1 = sum1 + score[i];
			
			if( i%2 == 0) //�迭�� �ε������� ¦���� �͸� 
				sum2 = sum2 + score[i];
 		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
