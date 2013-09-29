package MethodExam;
import java.util.Scanner;
public class Z09_Method10 {
	
	static boolean guguDan(int sDan, int eDan) {		
		if( sDan >= eDan) {
			System.out.println("구구단의 범위를 잘못 입력하였습니다.");
			return false;
		}
		else {			
			for(int i=1; i<=9; i++) {			
				for(int j=sDan; j<=eDan; j++) {
					
					System.out.printf("%d*%d=%2d  ", j, i, i*j);
				}
				System.out.println();
			}
			return true;
		} 						
	}		
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);		
		System.out.print("시작 단 입력: ");
		int s = scan.nextInt();
		
		System.out.print("끝 단 입력: ");
		int e = scan.nextInt();
		
		boolean result = guguDan(s, e);		
		if( result ) 
			System.out.println("구구단 출력 완료");
		else 
			System.out.println("구구단 실패");
			

	}

}










