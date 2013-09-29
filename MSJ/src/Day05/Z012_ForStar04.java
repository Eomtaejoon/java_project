package Day05;

public class Z012_ForStar04 {

	public static void main(String[] args) {
		
		for (int i = 20/2; i > 0; i--)
		{
			for (int j = 20/2-i; j >=0; j--) {
				System.out.printf(" ");
			}
			for (int j = i*2-1; j >= 1; j--) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
