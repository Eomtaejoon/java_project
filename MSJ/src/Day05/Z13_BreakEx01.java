package Day05;
import java.util.Scanner;
public class Z13_BreakEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inStr;
		char ch;	
		
		while(true) {			
			
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			inStr = scan.next();			
			ch = inStr.charAt(0);
			
			if( ch == 'N' || ch == 'n' ){
				System.out.println("��~~~~");
				break;
			}else if( ch == 'Y' || ch == 'y') {
				continue;
			}else {
				System.out.println("�߸��� �����Դϴ�.!!");
			}						
		}
	}
}








