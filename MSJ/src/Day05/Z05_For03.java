package Day05;
import java.util.Scanner;
public class Z05_For03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단 입력: ");
		int dan = scan.nextInt();
		System.out.print("곱하는 범위: ");
		int cnt = scan.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}		
		

	}

}










