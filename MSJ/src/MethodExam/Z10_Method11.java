package MethodExam;
import java.util.Scanner;
public class Z10_Method11 {	
	static Scanner scan = new Scanner(System.in);
	
	static boolean starPtr(int cnt) {		
		if( cnt <= 0 ) {
			System.out.println("0개 이하의 별모양은 출력할 수 없음.");
			return false;
		}else {
			for(int i=0; i<cnt; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			return true;
		}		
	}
	static int instarCnt() {		
		System.out.print("별 출력 갯수 입력: ");				
		return scan.nextInt();		
	}
	public static void main(String[] args) {		
		while(true) {				
			int sCnt = instarCnt();		
			if( starPtr(sCnt) )
				System.out.println("별모양 출력 완료!");
			else 
				System.out.println("별모양 출력 실패!");		
			
			scan.nextLine();			
			System.out.print("계속 출력하시겠습니까? ");
			String ss = scan.nextLine();
			
			if( ss.equals("y") || ss.equals("Y") )
				continue;
			else			
				break;
		}
	}
}










