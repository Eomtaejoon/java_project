package Day03;
import java.util.Scanner;
public class Z04_ifelseif04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.print("정수값을 입력하세요: ");
		int n = s.nextInt();
		
		if( (n % 2) == 0 ) {
			System.out.println("짝수");
		}
		else if ( (n % 2) == 0 ) {
			System.out.println("홀수");
		}
		
	}

}
