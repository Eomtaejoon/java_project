package Day05;
import java.util.Random;
import java.util.Scanner;

public class Z00_GameRock {	
	public static void main(String[] args) {
		int user;      //���� �Է�
		int computer; //��ǻ�� 
		boolean flag = true; //�ݺ����� flag ����

		Random r = new Random(); //���� �Լ� ����        
		Scanner key = new Scanner(System.in); //Ű���� �Է� �Լ� ����
		while(flag) {
			//0 ~ 2 ������ ������ ���Ѵ�(��ǻ�Ͱ� ���������� ����)
			computer = Math.abs(r.nextInt() % 3);
			
			System.out.println();
			System.out.println("## ���� ���� �� �� �ϳ��� �����ϼ���.(����:1, ����:2, ��=3)");
			System.out.print("-> �Է�: ");
			user = key.nextInt(); //(������ ���������� ����)

			if( user == 1 ) { // ������ 1: ������ �����ϸ�
				if( computer == 0 ) System.out.println("-���º� (��ǻ��:����, ����:����)");
				if( computer == 1 ) System.out.println("-��ǻ�� ��! (��ǻ��:����, ����:����)");
				if( computer == 2 ) System.out.println("-��� ��! (��ǻ��: ��, ����: ����)");
			}
			else if( user == 2 ) { // ������ 2: ������ �����ϸ�
				if( computer == 0 ) System.out.println("- ��� ��! (��ǻ��: ����, ����: ����)");
				if( computer == 1 ) System.out.println("- ���º� (��ǻ��: ����, ����: ����)");
				if( computer == 2 ) System.out.println("- ��ǻ�� ��! (��ǻ��: ��, ����: ����)");
			}
			else if( user == 3 ) { // ������ 3: ���� �����ϸ�
				if( computer == 0 ) System.out.println("- ��ǻ�� ��! (��ǻ��: ����, ����: ��)");
				if( computer == 1 ) System.out.println("- ��� ��! (��ǻ��: ����, ����: ��)");
				if( computer == 2 ) System.out.println("- ���º� (��ǻ��: ��, ����: ��)");
			}
			System.out.println();
			System.out.print("## ������ ��� �ϽǷ���??(1/2) ");
			int yesno = key.nextInt();

			if ( yesno == 1 ) flag = true;
			else flag = false;			
		}
		System.out.println("������ �� �ؿ�~~~");
	}
}
