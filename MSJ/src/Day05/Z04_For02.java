package Day05;
import java.util.Scanner;
public class Z04_For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("╢э ют╥б: ");
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}

	}

}
