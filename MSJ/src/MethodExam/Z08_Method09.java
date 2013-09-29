package MethodExam;
import java.util.Scanner;
public class Z08_Method09 {

	static void div(int x, int  y) {
		
		if ( x == 0 || y == 0 )
			System.out.println("0으로 나눌수 없음");
		else			
			System.out.println(x+y);		
	}	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y;
		
		System.out.print("x : ");
		x = scan.nextInt();
		System.out.print("y : ");
		y = scan.nextInt();
		
		int s;
		div(x, y);
	}
}
