package Day06;

public class Z04_Array04 {
	public static void main(String[] args) {
		
		int[] score = new int[100];
		int sum1 = 0, sum2 = 0;
		
		for(int i=0; i<100; i++) {
			
			score[i] = i+1;
			
			if( score[i]%2 == 0) //배열의 실제값이 짝수인 것만 
				sum1 = sum1 + score[i];
			
			if( i%2 == 0) //배열의 인덱스값이 짝수인 것만 
				sum2 = sum2 + score[i];
 		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
