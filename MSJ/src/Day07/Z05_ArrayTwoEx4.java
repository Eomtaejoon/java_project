package Day07;
import java.util.Scanner;
public class Z05_ArrayTwoEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		double[][] score = new double[3][5];
		double sum = 0;
		
		System.out.println("3행 5열의 배열의 숫자 저장");					  	
		for(int i = 0; i < score.length; i++) {			
			System.out.print( i + ": ");			
			
			for(int j = 0; j < score[i].length - 2; j++) {			
				score[i][j] = scan.nextDouble();
				sum = sum + score[i][j];
			}
			score[i][3] = sum;
			score[i][4] = sum / 3;
			sum = 0;
		}			
		for(int i = 0; i < score.length; i++) {			
			System.out.print(i + ": ");			
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}


