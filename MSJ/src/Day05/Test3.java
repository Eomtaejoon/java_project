package Day05;

import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		
		System.out.print("문자열 입력: ");
		s1 = scan.next(); //문자열 입력이지만 띄어쓰기 공백이 적용안됨
		
		scan.nextLine();
		
		System.out.print("문자열 입력: ");
		s2 = scan.nextLine();//문자열 입력이지만 띄어쓰기 공백이 적용됨
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
