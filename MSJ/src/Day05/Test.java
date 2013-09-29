package Day05;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int  menu_num;
		do  {
		        System.out.println("+-+-+ Menu List +-+-+ ");
		        System.out.println("1. Â¥Àå¸é ");
		        System.out.println("2. ±èÄ¡Âî°³ ");
		        System.out.println("3. µÈÀåÂî°³ ");
		        System.out.println("4. Âî°³ ");
		        System.out.println("5. Exit ");
		        System.out.println("¸Ş´º¸¦ ¼±ÅÃÇÏ½Ã¿À : ");
		        
		        menu_num = scan.nextInt();		        
		        
		} while (menu_num >= 1 && menu_num <= 4);

	}

}
