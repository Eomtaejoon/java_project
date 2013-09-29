package Day04;
import java.util.Scanner;
public class TestWhile {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
			
		int sum = 0;
		int n;
		
		System.out.println("숫자 입력(끝내려면 0값 입력): ");
		while( true ){				
			n = s.nextInt();
			
			if( n == 0 )
				break;
			
			sum = sum + n;		
			
		}		
		System.out.println("더한 결과: " + sum);
	}

}
