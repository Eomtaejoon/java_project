package Day07;
import java.util.Scanner;
public class ExamArrayTwoScore1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int	i, j;
		double avg=0, tot=0;		
		double[][] grade = new double[3][5];
		
		for(i = 0; i < 3;i++) {
			System.out.print((i+1) + "��° �л��� ����,����,���� ���� �Է� [90 78 87]: ");
			
			for(j = 0;j < 3;j++) {
				grade[i][j] = scan.nextDouble();
				tot = tot + grade[i][j];			
			}
			grade[i][3] = tot;
			grade[i][4] = tot / 3;
			tot = 0;			
		}		
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     ��      ��     ǥ                   ");
		System.out.println("===================================================");
		System.out.println("NO\t����\t����\t����\t����\t���\t����");
		
		for(i = 0;i < 3;i++) 	{
			System.out.print((i+1) + "\t");			
			for(j = 0;j < 4;j++) 	{				
				System.out.printf("%.0f\t", grade[i][j]);				
			}			
			System.out.printf("%.1f\t", grade[i][4]);
			
			if(grade[i][4] >= 90) System.out.println(" A");
			else if((grade[i][4] < 90) && (grade[i][4] >= 80)) System.out.println(" B");
			else if((grade[i][4] < 80) && (grade[i][4] >= 70)) System.out.println(" C");
			else if((grade[i][4] < 70) && (grade[i][4] >= 60)) System.out.println(" D");
			else System.out.println(" F");				
		}		
		System.out.println("===================================================");
	}
}








