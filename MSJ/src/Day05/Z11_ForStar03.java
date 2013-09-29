package Day05;
public class Z11_ForStar03 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= (10/2+1); i++)
		{
			for (int j = i; j <= 10/2; j++) {
				System.out.printf(" ");
			}			
			for (int j = 1; j <= (i*2-1); j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
			
		}
	}
}
