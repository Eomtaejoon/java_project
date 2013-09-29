package Day03;
import java.util.Scanner;
public class Z05_Ifelseif05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요: ");
		int n = s.nextInt();
		
		if( (n % 2) == 0 && (n % 3) == 0 ) {
			System.out.println("짝수이면서 3의 배수임");
		}
		else if ( (n % 2) == 0 && (n % 3) != 0) {
			System.out.println("짝수이지만 3의 배수는 아님");
		}
		else {
			System.out.println("홀수");
		}

	}

}
