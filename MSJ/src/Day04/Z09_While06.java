package Day04;
import java.util.Scanner;
public class Z09_While06 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("반복할 횟수 지정: ");
		int cnt = s.nextInt();
		int i = 1;
		
		while( i <= cnt ) {
			
			System.out.println(cnt);
			i++;
		}		
		
	}

}
