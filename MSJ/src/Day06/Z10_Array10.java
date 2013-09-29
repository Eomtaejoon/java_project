package Day06;
import java.util.Scanner;
public class Z10_Array10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] name = new char[4];
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.print("Name[" + i + "]: ");
			
			String s = scan.next();
			char c = s.charAt(0);
			
			name[i] = c;			
		}
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
		}		
	}
}
