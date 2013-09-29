package Day06;
import java.util.Scanner;
public class ExamSwitchCaseCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, res = 0;
		char op;
		String str;
		
		System.out.println("수식을 입력하세요");
		System.out.print("숫자1(실수포함): ");
		a = scan.nextDouble();
		
		scan.nextLine();//여기서는 생략 가능
		
		System.out.print("연산자(+,-,*,/): ");
		str = scan.next();
		op = str.charAt(0);
		
		System.out.print("숫자2(실수포함): ");
		b = scan.nextDouble();		

		switch(op) {
			case '+' : res=a+b;	break;
			case '-' : res=a-b;	break;
			case '*' : res=a*b;	break;
			case '/' : res=a/b; break;
		}
		//System.out.println("연산결과는 " + res + " 입니다.");
		System.out.printf("연산결과는 %f", res);
	}
}



