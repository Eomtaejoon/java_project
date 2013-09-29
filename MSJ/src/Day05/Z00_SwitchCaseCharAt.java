package Day05;
import java.util.Scanner;
public class Z00_SwitchCaseCharAt {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		
		for(;;) {		
			System.out.print("알파벳 문자 입력(종료 1): ");
			s = scan.nextLine();
			char c = s.charAt(0);
			
			switch( c ) {
				case 'a':
				case 'i':
				case 'o':
				case 'u':
				case 'e':
					System.out.println("모음 입니다.");
					break;			
				default:
					System.out.println("자음 입니다.");			
			}
			if( c == '1') {
				System.out.println("프로그램 종료~~~~~~");
				break;
			}
		}
	}
}

