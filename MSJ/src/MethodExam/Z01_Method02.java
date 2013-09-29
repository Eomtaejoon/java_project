package MethodExam;

import java.util.Scanner;

public class Z01_Method02 {
	/** 메소드(Method) 1형식: 반환값(return)없음, 파라메터(parameter)없음 */
	
	//메소드 정의
	static void displayTitle() {
		System.out.println("===========================");
		System.out.println("        성적 관리 프로그램");
		System.out.println("===========================");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 석차 검색");
		System.out.println("4. 성적 수정");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하세요(1~5): ");
	}	
	public static void main(String[] args) {	
		displayTitle(); // 메소드 호출
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
				
	}
}














