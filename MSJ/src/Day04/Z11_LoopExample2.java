package Day04;
import java.util.Scanner;
public class Z11_LoopExample2 {

	public static void main(String[] args) {
		int dan;
		int i = 1;
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		
		dan = scan.nextInt();
		
		while (i <= 9) {
			System.out.println(dan + "*"+ i + "=" + dan * i);
			i++;
		}

	}

}
