package Day05;
import java.util.Random;
import java.util.Scanner;

public class Z00_GameRock {	
	public static void main(String[] args) {
		int user;      //유저 입력
		int computer; //컴퓨터 
		boolean flag = true; //반복여부 flag 변수

		Random r = new Random(); //랜덤 함수 생성        
		Scanner key = new Scanner(System.in); //키보드 입력 함수 생성
		while(flag) {
			//0 ~ 2 사이의 난수를 구한다(컴퓨터가 가위바위보 결정)
			computer = Math.abs(r.nextInt() % 3);
			
			System.out.println();
			System.out.println("## 가위 바위 보 중 하나를 선택하세요.(가위:1, 바위:2, 보=3)");
			System.out.print("-> 입력: ");
			user = key.nextInt(); //(유저가 가위바위보 결정)

			if( user == 1 ) { // 유저가 1: 가위를 선택하면
				if( computer == 0 ) System.out.println("-무승부 (컴퓨터:가위, 유저:가위)");
				if( computer == 1 ) System.out.println("-컴퓨터 승! (컴퓨터:바위, 유저:가위)");
				if( computer == 2 ) System.out.println("-사람 승! (컴퓨터: 보, 유저: 가위)");
			}
			else if( user == 2 ) { // 유저가 2: 바위를 선택하면
				if( computer == 0 ) System.out.println("- 사람 승! (컴퓨터: 가위, 유저: 바위)");
				if( computer == 1 ) System.out.println("- 무승부 (컴퓨터: 바위, 유저: 바위)");
				if( computer == 2 ) System.out.println("- 컴퓨터 승! (컴퓨터: 보, 유저: 바위)");
			}
			else if( user == 3 ) { // 유저가 3: 보를 선택하면
				if( computer == 0 ) System.out.println("- 컴퓨터 승! (컴퓨터: 가위, 유저: 보)");
				if( computer == 1 ) System.out.println("- 사람 승! (컴퓨터: 바위, 유저: 보)");
				if( computer == 2 ) System.out.println("- 무승부 (컴퓨터: 보, 유저: 보)");
			}
			System.out.println();
			System.out.print("## 게임을 계속 하실래요??(1/2) ");
			int yesno = key.nextInt();

			if ( yesno == 1 ) flag = true;
			else flag = false;			
		}
		System.out.println("다음에 또 해요~~~");
	}
}
