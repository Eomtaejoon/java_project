package Day05;
import java.util.Scanner;
public class Z00_SwitchCaseCharAt {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		
		for(;;) {		
			System.out.print("���ĺ� ���� �Է�(���� 1): ");
			s = scan.nextLine();
			char c = s.charAt(0);
			
			switch( c ) {
				case 'a':
				case 'i':
				case 'o':
				case 'u':
				case 'e':
					System.out.println("���� �Դϴ�.");
					break;			
				default:
					System.out.println("���� �Դϴ�.");			
			}
			if( c == '1') {
				System.out.println("���α׷� ����~~~~~~");
				break;
			}
		}
	}
}

