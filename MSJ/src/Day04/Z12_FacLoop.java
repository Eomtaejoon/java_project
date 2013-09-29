package Day04;
import java.util.Scanner;
public class Z12_FacLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fac, result = 1;
		
		System.out.print("팩토리얼 정수값 입력: ");
		fac = scan.nextInt();
		
		while( fac > 0 ) {
			
			result = result * fac;
			
			if( fac != 1 )
				System.out.print(fac + "*" );
			else 
				System.out.print(fac + "=" );
			
			fac--;
		}
		System.out.println(result);
		
	}

}
