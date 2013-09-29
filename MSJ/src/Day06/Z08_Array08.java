package Day06;
import java.util.Scanner;
public class Z08_Array08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[3];
		double tot = 0, avg = 0;
				
		System.out.println("점수 입력 후 총점과 평균을 구함");
		
		for(int i=0; i<3; i++) {			
			System.out.print("점수 " + (i+1) + ":");
			score[i] = scan.nextDouble();					
			tot = tot + score[i];
		}		
		//for(int i=0; i<3; i++) {
			
		//}
		avg = tot / 3;
		
		System.out.println("총점: " + tot + "  평균: " + avg);
	}
}
