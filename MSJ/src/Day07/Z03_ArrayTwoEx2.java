package Day07;
import java.util.Scanner;
public class Z03_ArrayTwoEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[][] score = new int[2][3];
		int sum = 0, cnt = 1;
		
		/////////////////////////////////////////////////////
		System.out.println("3행 4열의 배열의 숫자 저장");					  	
		for(int i = 0; i < score.length; i++) {			
			System.out.print( i + ": ");			
			for(int j = 0; j < score[i].length; j++) {			
				score[i][j] = scan.nextInt();				
			}			
		}
		////////////////////////////////////////////////////
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				if( score[i][j] % 2 == 0)
					sum = sum + score[i][j];
			}
		}		
		double avg = sum / 6.0;
		System.out.println(avg);
		/////////////////////////////////////////////////////
		for(int i = 0; i < score.length; i++) {			
			for(int j = 0; j < score[i].length; j++) {			
				System.out.println(score[i][j]);				
			}			
		}
		////////////////////////////////////////////////////////
	}
}
