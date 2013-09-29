package Day05;

import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;		
		do {
			System.out.println("메뉴 환경");
			System.out.println("1. 내 정보");
			System.out.println("2. 메시지");
			System.out.println("3. 전화 번호");
			System.out.println("4. 환경 설정");
			System.out.println("5. 종료");
			System.out.print("메뉴 선택: ");
			choice = scan.nextInt();			
			switch( choice ) {
				case 1: System.out.println("1. 내 정보 출력");
						break;
				case 2: System.out.println("2. 메시지 출력");
						break;
				case 3: System.out.println("3. 전화 번호 출력");
						break;
				case 4: System.out.println("4. 환경 설정 출력");
						break;
				case 5: System.out.println("5. 종료 출력");
						break;
			}
			System.out.println();System.out.println();			
		} while( choice >= 1 && choice <= 4 );
	}
}







