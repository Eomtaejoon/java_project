package Day03;
import java.util.Scanner;
public class Z07_Ifelse07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		System.out.print("������ �Է��ϼ���: ");
		int n = s.nextInt();
		
		if( (n%2)==0 && (n%3)==0 && (n%9)==0 )
			System.out.println("¦�� �̸鼭 3�� ��� 9�� �����");
		else
			System.out.println("�ƴ�");

		
	}

}
