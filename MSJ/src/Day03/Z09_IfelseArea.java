package Day03;
import java.util.*;
public class Z09_IfelseArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("��ȣ�� �������ּ���....");
		System.out.println("1. �簢�� ����");
		System.out.println("2. �ﰢ�� ����");
		System.out.print("����: ");
		int num = s.nextInt();
		
		if(  num == 1 ) { //�簢�� �϶�
			System.out.print("���� ���� �Է�: ");
			int w = s.nextInt();
			System.out.print("���� ���� �Է�: ");
			int h = s.nextInt();
			
			if( w == 0 || h == 0 ) {
				System.out.println("�Էµ� ���� 0�Դϴ�.");
				System.exit(0);
			}				
			
			int area = w * h;
			System.out.println("�簢���� ���̴� " + area);
		}
		else if( num == 2 ) { //�ﰢ�� �϶� 
			System.out.print("�غ� �Է�: ");
			int u = s.nextInt();
			System.out.print("���� �Է�: ");
			int h = s.nextInt();
			
			int area = (u * h) / 2;
			System.out.println("�ﰢ���� ���̴� " + area);
		}
		else {
			System.out.println("�߸��� ��ȣ�Դϴ�. ");
			System.exit(0); //���α׷� ���� ����
		}

	}

}














