package Day07;
import java.util.Scanner;
public class Z04_ArrayTwoEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[][] score = new int[10][10];
		int sum = 0, cnt = 1;
		double avg = 0;		
		
		/////////////////////////////////////////////////////
		System.out.println("== 10행 10열의 배열의 숫자 저장 ==");					  	
		for(int i = 0; i < score.length; i++) {				
			for(int j = 0; j < score[i].length; j++) {			
				score[i][j] = cnt++;
				//System.out.print(score[i][j] + " ");
				//sum = sum + score[i][j];
			}			
		}
		//////////////////////////////////////////////////////
		for(int i = 0; i < score.length; i++) {				
			for(int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
			}
			System.out.println(i + "번째 행의 합: " + sum + " 평균: " + sum/10.0);			
			sum = 0;
		}
		
		
		/*System.out.println();
		System.out.println("합: " + sum);
		System.out.println("평균: " + sum/100.0 );
		*/		
	}
}









