package Day07;
import java.util.Scanner;
public class ExamArrayTwoScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int	i, j, tot=0;
		double avg=0;		
		int[][] grade = new int[3][3];
		
		for(i = 0; i < 3;i++) {
			System.out.print((i+1) + "��° �л��� ����,����,���� ���� �Է� [90 78 87]: ");
			for(j = 0;j < 3;j++) {
				grade[i][j] = scan.nextInt();				
			}
		}
		
		System.out.println();
		System.out.println("===================================================");
		System.out.println("                                     ��      ��     ǥ                   ");
		System.out.println("===================================================");
		System.out.println("NO\t����\t����\t����\t����\t���\t����");
		
		for(i = 0;i < 3;i++) 	{
			System.out.print((i+1) + "\t");			
			for(j = 0;j < 3;j++) 	{
				tot = tot + grade[i][j];
				System.out.print(grade[i][j] + "\t");
				
			}
			avg = (double)tot / 3;
			System.out.print(tot + "\t");
			System.out.printf("%.2f\t", avg);
			tot = 0;
			
			if(avg >= 90) System.out.println(" A");
			else	if((avg < 90) && (avg >= 80)) System.out.println(" B");
			else	if((avg < 80) && (avg >= 70)) System.out.println(" C");
			else	if((avg < 70) && (avg >= 60)) System.out.println(" D");
			else	System.out.println(" F");
			avg = 0;
		}		
		System.out.println("===================================================");
	}
}
