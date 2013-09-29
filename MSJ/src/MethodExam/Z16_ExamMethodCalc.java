package MethodExam;
import java.util.Scanner;
public class Z16_ExamMethodCalc {	
	static Scanner scan = new Scanner(System.in);
	
	static void title() {
		System.out.println();
		System.out.println("초간단한 두자리수 계산기");
		System.out.println("1. 덧셈 ");
		System.out.println("2. 뺄셈 ");
		System.out.println("3. 곱셉 ");
		System.out.println("4. 나눗셈 ");
		System.out.println("5. 종료 ");
		System.out.print("-> 메뉴 선택: ");
	}	
	static void add(int x, int y) {
		System.out.println("결과:" + x + "+" + y + "=" + (x+y));
	}
	static void sub(int x, int y) {
		System.out.println("결과:" + x + "-" + y + "=" + (x-y));
	}
	static void mul(int x, int y) {
		System.out.println("결과:" + x + "*" + y + "=" + (x*y));
	}
	static void div(int x, int y) {
		System.out.println("결과:" + x + "/" + y + "=" + x/y);
	}	
	static int inputNumber() {	
		System.out.printf("정수 입력: ");
		return scan.nextInt();		
	}	
	public static void main(String[] args) {		
		
		do{		
			title();		
			int choice = scan.nextInt();		
			int num1, num2; 
			
			switch(choice) {
				case 1:
					System.out.print("1번 ");
					num1 = inputNumber();
					System.out.print("2번 ");
					num2 = inputNumber();				
					add(num1, num2);				
					break;
				case 2:
					System.out.print("1번 ");
					num1 = inputNumber();
					System.out.print("2번 ");
					num2 = inputNumber();					
					sub(num1, num2);
					break;
				case 3:
					System.out.print("1번 ");
					num1 = inputNumber();
					System.out.print("2번 ");
					num2 = inputNumber();					
					mul(num1, num2);
					break;
				case 4:
					System.out.print("1번 ");
					num1 = inputNumber();
					System.out.print("2번 ");
					num2 = inputNumber();					
					div(num1, num2);
					break;
				case 5:
					System.out.println("프로그램 종료!!");
					System.exit(0);
				default: 
					System.out.println("메뉴를 잘못 입력함!!");
					break;				
			}
		}while(true);
	}
}
























