package Day06;
import java.util.Scanner;
public class ExamSwitchCaseCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, res = 0;
		char op;
		String str;
		
		System.out.println("������ �Է��ϼ���");
		System.out.print("����1(�Ǽ�����): ");
		a = scan.nextDouble();
		
		scan.nextLine();//���⼭�� ���� ����
		
		System.out.print("������(+,-,*,/): ");
		str = scan.next();
		op = str.charAt(0);
		
		System.out.print("����2(�Ǽ�����): ");
		b = scan.nextDouble();		

		switch(op) {
			case '+' : res=a+b;	break;
			case '-' : res=a-b;	break;
			case '*' : res=a*b;	break;
			case '/' : res=a/b; break;
		}
		//System.out.println("�������� " + res + " �Դϴ�.");
		System.out.printf("�������� %f", res);
	}
}



