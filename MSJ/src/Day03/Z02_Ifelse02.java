package Day03;
import java.util.Scanner;
public class Z02_Ifelse02 {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("������ �Է��ϼ���: ");
		score = s.nextInt();

		if( score >=60 ) {
			System.out.println("�Է�����: " + score);
			System.out.println("�հ��Դϴ�....");
		}else {
			System.out.println("�Է�����: " + score);
			System.out.println("���հ��Դϴ�....");
		}
	}

}
