package Day06;

public class Z03_Array03 {
	public static void main(String[] args) {	
		
		int[] score = new int[1000];
		
		for( int i = 0; i < 1000; i++) {
			
			score[i] = i+1;
			System.out.println("score[" + i + "] = " + score[i]);
		}	
	}
}
