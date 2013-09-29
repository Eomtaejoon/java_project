package Day04;
import java.util.Scanner;
public class Z01_SwitchCase01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("평균을 입력(0~100): ");
		int avg = s.nextInt();
		
		if( avg > 100 ) avg = 100;
		if( avg < 0 ) avg = 0;
		
		int temp = avg / 10;		
		switch( temp ) {		
			case 10:
			case 9: 
				System.out.println("A학점!");
				break;
			case 8: 
				System.out.println("B학점!");
				break;
			case 7: 
				System.out.println("C학점!");
				break;
			case 6: 
				System.out.println("D학점!");
				break;
			default:
				System.out.println("F학점!");		
		}
	}
}
