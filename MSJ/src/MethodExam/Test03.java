package MethodExam;
import java.util.Scanner;
/** �޼ҵ� ����� �̿��� ���� ���α׷� */
public class Test03 {		
	static double avg=0, tot=0;		
	static double[][] grade = new double[3][5];
	
	static void title() {
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     ��      ��     ǥ                   ");
		System.out.println("===================================================");		
	}	
	static void inScore() {
		Scanner scan = new Scanner(System.in);		
		for(int i = 0; i < 3;i++) {
			System.out.print((i+1) + "��° �л��� ����,����,���� ���� �Է� [90 78 87]: ");
			
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
		System.out.println("NO\t����\t����\t����\t����\t���\t����");		
		for(int i = 0;i < 3;i++) 	{
			System.out.print((i+1) + "\t");			
			for(int j = 0;j < 4;j++) 	{				
				System.out.printf("%.0f\t", grade[i][j]);				
			}			
			System.out.printf("%.1f\t", grade[i][4]);			
			selectGrade(i); //���� ���ϴ� �޼ҵ� ȣ��			
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













