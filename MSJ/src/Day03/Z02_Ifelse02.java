package Day03;
import java.util.Scanner;
public class Z02_Ifelse02 {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력하세요: ");
		score = s.nextInt();

		if( score >=60 ) {
			System.out.println("입력점수: " + score);
			System.out.println("합격입니다....");
		}else {
			System.out.println("입력점수: " + score);
			System.out.println("불합격입니다....");
		}
	}

}
