package Day06;
import java.util.Scanner;
public class ExamDiaStar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j, number;
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			number = scan.nextInt();		
			
			if(number == 0) break;			
			 // 상단의 삼각형 출력
			for (i = 1; i <= (number/2+1); i++) {
				
				for (j = i; j <= number/2; j++)
					System.out.print(" ");
				
				for (j = 1; j <= i*2-1; j++)
					System.out.print("*");
	
				System.out.println();
			}			
			// 하단의 역삼각형 출력
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
