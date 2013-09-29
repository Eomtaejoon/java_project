package Day05;

public class TestStar {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1; i<10; i++) {
			
			for(j=2; j<10; j++) {
				
				System.out.printf("%d*%d=%2d\t", j,i,i*j);
			}
			System.out.println();
		}
		
		
		System.out.println();System.out.println();
		
		for(i=0; i<10; i++) {
			
			for(j=0; j<10; j++) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		
		for(i=0; i<10; i++) {
			
			for(j=0; j<i; j++) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();System.out.println();
		
		for(i=0; i<10; i++) {
			
			for(j=i; j<10; j++) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
