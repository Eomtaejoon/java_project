package Day04;
import java.util.Scanner;
public class Z03_SwitchCase03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month, year = 0, days = 0;
		
		System.out.print("�⵵�� �Է��Ͻÿ�:");		
		year = scan.nextInt();
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�:");		
		month = scan.nextInt();

		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) // ����
					days = 29;
				else
					// ���
					days = 28;
				break;
			default:
				System.out.println("���� �߸� �ԷµǾ����ϴ�.");
				break;
		}
		System.out.println("���� ������ " + days);


	}

}
