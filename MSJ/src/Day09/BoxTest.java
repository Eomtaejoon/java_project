package Day09;
import java.util.Scanner;

public class BoxTest {	
	public static void main(String[] args) {
		Box box = new Box();
		
		Scanner scan = new Scanner(System.in);	
		
		
		System.out.print("���� : ");
		int width = scan.nextInt();
		System.out.print("���� : ");
		int height = scan.nextInt();
		System.out.print("���� : ");
		int length = scan.nextInt();
		
		box.boxVolume(width, height, length);
		
		
		Box box2 = new Box();
		System.out.print("���� : ");
		int width2 = scan.nextInt();
		System.out.print("���� : ");
		int height2 = scan.nextInt();
		System.out.print("���� : ");
		int length2 = scan.nextInt();
		
		box2.boxVolume(width2, height2, length2);
		
	}
}






















