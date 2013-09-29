package Day06;
import java.util.Scanner;
public class Z07_Array07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] ary = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("ary[" + i + "] : ");
			ary[i] = scan.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(ary[i]);		
		}

	}

}
