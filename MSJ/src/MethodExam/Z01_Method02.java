package MethodExam;

import java.util.Scanner;

public class Z01_Method02 {
	/** �޼ҵ�(Method) 1����: ��ȯ��(return)����, �Ķ����(parameter)���� */
	
	//�޼ҵ� ����
	static void displayTitle() {
		System.out.println("===========================");
		System.out.println("        ���� ���� ���α׷�");
		System.out.println("===========================");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ���� ����");
		System.out.println("5. ����");
		System.out.println("�޴��� �����ϼ���(1~5): ");
	}	
	public static void main(String[] args) {	
		displayTitle(); // �޼ҵ� ȣ��
		
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
				
	}
}














