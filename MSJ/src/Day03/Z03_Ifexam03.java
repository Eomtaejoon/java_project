package Day03;
import java.util.Scanner;
public class Z03_Ifexam03 {
	/** �Էµ� ������ 100�̻��̿��� 100������ ó���ϴ� ����*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total;
		
		System.out.print("������ (0~100)�Է��ϼ���: ");
		total = s.nextInt();
		
		if( total > 100 ) 
			total = 100;
		
		if( total < 0 ) 
			total = 0;
		
		
		System.out.println("����:" + total);
	}

}










