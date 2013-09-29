package Day05;
import java.util.Scanner;
public class Z13_BreakEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inStr;
		char ch;	
		
		while(true) {			
			
			System.out.print("계속하시겠습니까?(y/n)");
			inStr = scan.next();			
			ch = inStr.charAt(0);
			
			if( ch == 'N' || ch == 'n' ){
				System.out.println("끝~~~~");
				break;
			}else if( ch == 'Y' || ch == 'y') {
				continue;
			}else {
				System.out.println("잘못된 문자입니다.!!");
			}						
		}
	}
}








