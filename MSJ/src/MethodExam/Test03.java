package MethodExam;
import java.util.Scanner;
/** 메소드 방식을 이용한 성적 프로그램 */
public class Test03 {		
	static double avg=0, tot=0;		
	static double[][] grade = new double[3][5];
	
	static void title() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     성      적     표                   ");
		System.out.println("===================================================");		
	}	
	static void inScore() {
		Scanner scan = new Scanner(System.in);		
		for(int i = 0; i < 3;i++) {
			System.out.print((i+1) + "번째 학생의 국어,영어,수학 점수 입력 [90 78 87]: ");
			
			for(int j = 0;j < 3;j++) {
				grade[i][j] = scan.nextDouble();
				tot = tot + grade[i][j];			
			}
			grade[i][3] = tot;
			grade[i][4] = tot / 3;
			tot = 0;			
		}	
	}
	static void outScore() {
		System.out.println("NO\t국어\t영어\t수학\t총점\t평균\t학점");		
		for(int i = 0;i < 3;i++) 	{
			System.out.print((i+1) + "\t");			
			for(int j = 0;j < 4;j++) 	{				
				System.out.printf("%.0f\t", grade[i][j]);				
			}			
			System.out.printf("%.1f\t", grade[i][4]);			
			selectGrade(i); //학점 구하는 메소드 호출			
		}		
	}
	static void selectGrade(int i) {
		if(grade[i][4] >= 90) System.out.println(" A");
		else if((grade[i][4] < 90) && (grade[i][4] >= 80)) System.out.println(" B");
		else if((grade[i][4] < 80) && (grade[i][4] >= 70)) System.out.println(" C");
		else if((grade[i][4] < 70) && (grade[i][4] >= 60)) System.out.println(" D");
		else System.out.println(" F");
	}			
	public static void main(String args[]) {		
		title();
		inScore();
		outScore();			
	}
}













