package Day04;
import java.util.Scanner;
public class Z14_DoWhile01 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է�: ");
		int dan = scan.nextInt();
		int i = 1;
		
		do {
			System.out.println(dan + "*" + i + "=" + dan*i);
			i++;			
		}while( i < 10 );
		

	}

}
