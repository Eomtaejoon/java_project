package Day04;
import java.util.Scanner;
public class Z01_SwitchCase01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �Է�(0~100): ");
		int avg = s.nextInt();
		
		if( avg > 100 ) avg = 100;
		if( avg < 0 ) avg = 0;
		
		int temp = avg / 10;		
		switch( temp ) {		
			case 10:
			case 9: 
				System.out.println("A����!");
				break;
			case 8: 
				System.out.println("B����!");
				break;
			case 7: 
				System.out.println("C����!");
				break;
			case 6: 
				System.out.println("D����!");
				break;
			default:
				System.out.println("F����!");		
		}
	}
}
