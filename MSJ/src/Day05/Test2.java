package Day05;

import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;		
		do {
			System.out.println("�޴� ȯ��");
			System.out.println("1. �� ����");
			System.out.println("2. �޽���");
			System.out.println("3. ��ȭ ��ȣ");
			System.out.println("4. ȯ�� ����");
			System.out.println("5. ����");
			System.out.print("�޴� ����: ");
			choice = scan.nextInt();			
			switch( choice ) {
				case 1: System.out.println("1. �� ���� ���");
						break;
				case 2: System.out.println("2. �޽��� ���");
						break;
				case 3: System.out.println("3. ��ȭ ��ȣ ���");
						break;
				case 4: System.out.println("4. ȯ�� ���� ���");
						break;
				case 5: System.out.println("5. ���� ���");
						break;
			}
			System.out.println();System.out.println();			
		} while( choice >= 1 && choice <= 4 );
	}
}







