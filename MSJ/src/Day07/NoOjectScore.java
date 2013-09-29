package Day07;
import java.util.Scanner;
public class NoOjectScore {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i,j, tot = 0;
		double avg = 0;
		int score[][] = new int[5][3];		
				
		System.out.println("성적 점수 입력");
		System.out.println("   KOR ENG MATH");
		for(i=0; i<5; i++) {
			System.out.print(" " + (i+1) + ": ");
			
			for(j=0; j<3; j++) {
				score[i][j] = s.nextInt();				
			}
		}		
		System.out.println("NO\tKOR\tENG\tMATH\tTOT\tAVG");
		
		for(i=0; i<5; i++) {
			for(j=0; j<3; j++) {
				tot += score[i][j];				
			}
			avg = (double)tot / 3;
			
			System.out.print((i+1) + "\t");
			for(j=0; j<3; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println( tot + "\t" + avg + "\t");
			tot = 0;
			avg = 0;				
		}	
	}
}









