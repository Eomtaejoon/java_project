package Day07;
import java.util.Scanner;
public class Z04_ArrayTwoEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[][] score = new int[10][10];
		int sum = 0, cnt = 1;
		double avg = 0;		
		
		/////////////////////////////////////////////////////
		System.out.println("== 10�� 10���� �迭�� ���� ���� ==");					  	
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
			System.out.println(i + "��° ���� ��: " + sum + " ���: " + sum/10.0);			
			sum = 0;
		}
		
		
		/*System.out.println();
		System.out.println("��: " + sum);
		System.out.println("���: " + sum/100.0 );
		*/		
	}
}









