package Day05;

import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		
		System.out.print("���ڿ� �Է�: ");
		s1 = scan.next(); //���ڿ� �Է������� ���� ������ ����ȵ�
		
		scan.nextLine();
		
		System.out.print("���ڿ� �Է�: ");
		s2 = scan.nextLine();//���ڿ� �Է������� ���� ������ �����
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
