package Day06;
import java.util.Scanner;
public class ExamDiaStar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, number;
		while(true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			number = scan.nextInt();		
			
			if(number == 0) break;			
			 // ����� �ﰢ�� ���
			for (i = 1; i <= (number/2+1); i++) {
				
				for (j = i; j <= number/2; j++)
					System.out.print(" ");
				
				for (j = 1; j <= i*2-1; j++)
					System.out.print("*");
	
				System.out.println();
			}			
			// �ϴ��� ���ﰢ�� ���
			for (i = number/2; i > 0; i--) {
				
				for (j = number/2-i; j >= 0; j--)				
					System.out.print(" ");
				
				for (j = i*2-1; j >= 1; j--)
					System.out.print("*");
	
				System.out.println();
			}			
		}
	}
}
