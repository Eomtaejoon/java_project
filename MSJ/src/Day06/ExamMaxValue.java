package Day06;
import java.util.Scanner;
public class ExamMaxValue {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d, max;

		System.out.println("4���� ������ �Է��Ͻÿ�");
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		System.out.print("d : ");
		d = scan.nextInt();
		
		max = (a > b) ? a : b;
		max = (c > max) ? c : max;
		max = (d > max) ? d : max;

		System.out.println("�ִ밪�� : " + max);
	}
}











