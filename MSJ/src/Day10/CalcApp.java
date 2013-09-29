package Day10;
import java.util.Scanner;
public class CalcApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calc calc = new Calc();
		
		System.out.print("정수1: ");
		int num1 = scan.nextInt();
		System.out.print("정수2: ");
		int num2 = scan.nextInt();
		
		calc.setNum(num1, num2);
		
		int result;		
		result = calc.addC();
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		result = calc.subC();
		System.out.println(num1 + "-" + num2 + "=" + result);

		result = calc.mulC();
		System.out.println(num1 + "*" + num2 + "=" + result);
		
		result = calc.divC();
		System.out.println(num1 + "/" + num2 + "=" + result);
	}

}
