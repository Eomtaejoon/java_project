package MethodExam;
import java.util.Scanner;
public class Z17_ExamMethodArea {

	static double square(double w, double h) {		
		if( w == 0 || h == 0) {
			System.out.println("   가로 또는 세로 값이 입력되지 않았습니다.");
			return 0;
		}else {
			double area = w * h;
			return area;
		}
	}
	static double triangle(double u, double h) {
		if( u == 0 || h == 0) {
			System.out.println("   밑변 또는 높이 값이 입력되지 않았습니다.");
			return 0;
		}else {
			double area = (u*h) / 2;
			return area;
		}
	}
	static double circle(double r) {
		if( r == 0) {
			System.out.println("   반지름 값이 입력되지 않았습니다.");
			return 0;
		}else {
			double area = (r*r)*3.14159265;
			return area;
		}
	}	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int cho;
		double width, height, area, radius;
		
		do {
			System.out.println("== 넓이 구하는 프로그램 ==");
			System.out.println("  1. 사각형 넓이");
			System.out.println("  2. 삼각형 넓이");
			System.out.println("  3. 원의 넓이");
			System.out.println("  4. 종료");
			System.out.print("  -> 메뉴 선택: ");
			cho = scan.nextInt();
			
			//이 문장이 swtich case의 defalut로 처리해도 상관없음. 
			if( cho < 1 || cho > 4 ) {
				System.out.println("메뉴 선택을 잘못하였습니다.");
				System.out.println();			
				continue;
			}	
			switch(cho) {				
				case 1: //사각형					
					System.out.print("   가로 : ");
					width = scan.nextDouble();
					System.out.print("   세로 : ");
					height = scan.nextDouble();					
					
					if( ( area = square(width, height) ) == 0 ) {	
						System.out.println();
						continue;
					}else {	
						System.out.println("   사각형 넓이: " + area);
						System.out.println();
						break;
					}			
				
				case 2: //삼각형					
					System.out.print("   밑변 : ");
					width = scan.nextDouble();
					System.out.print("   높이 : ");
					height = scan.nextDouble();					
					
					if( (area = triangle(width, height) ) == 0 ) {
						System.out.println();
						continue;
					}else {						
						System.out.println("   삼각형 넓이: " + area);
						System.out.println();
						break;
					}					
				case 3: //원					
					System.out.print("   반지름 : ");
					radius = scan.nextDouble();										
					
					if( (area = circle(radius)) == 0 ) {
						System.out.println();
						continue;
					}else {						
						System.out.println("  반지름 넓이: " + area);
						System.out.println();
						break;
					}					
				case 4:
					System.out.println("== 프로그램 종료 ==");
					System.exit(0);								
			}
		}while(true);
	}

}
