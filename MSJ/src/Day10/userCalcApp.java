package Day10;
import java.util.Scanner;
public class userCalcApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		userADD uadd = new userADD();
		userSUB usub = new userSUB();
		userDIV udiv = new userDIV();
		
		int x, y;		
		System.out.print("����1: ");
		x = scan.nextInt();
		System.out.print("����2: ");
		y = scan.nextInt();
		
		do {
			System.out.println("1. ���ϱ� ");
			System.out.println("2. ���� ");
			System.out.println("3. ������ ");
			System.out.print(">> �޴� ����: ");
			int cho = scan.nextInt();
			
			switch(cho) {
				case 1: uadd.setNum(x, y);
						uadd.addC();
					break;
				case 2: usub.setNum(x, y);
						usub.subC();
					break;
				case 3: 
						udiv.setNum(x, y);
						udiv.divC();
					break;
			}			
		}while(true);
	}

}







