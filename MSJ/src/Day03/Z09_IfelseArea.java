package Day03;
import java.util.*;
public class Z09_IfelseArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("번호를 선택해주세요....");
		System.out.println("1. 사각형 넓이");
		System.out.println("2. 삼각형 넓이");
		System.out.print("선택: ");
		int num = s.nextInt();
		
		if(  num == 1 ) { //사각형 일때
			System.out.print("가로 길이 입력: ");
			int w = s.nextInt();
			System.out.print("세로 길이 입력: ");
			int h = s.nextInt();
			
			if( w == 0 || h == 0 ) {
				System.out.println("입력된 값이 0입니다.");
				System.exit(0);
			}				
			
			int area = w * h;
			System.out.println("사각형의 넓이는 " + area);
		}
		else if( num == 2 ) { //삼각형 일때 
			System.out.print("밑변 입력: ");
			int u = s.nextInt();
			System.out.print("높이 입력: ");
			int h = s.nextInt();
			
			int area = (u * h) / 2;
			System.out.println("삼각형의 넓이는 " + area);
		}
		else {
			System.out.println("잘못된 번호입니다. ");
			System.exit(0); //프로그램 강제 종료
		}

	}

}














