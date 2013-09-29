package Day05;
public class Z08_ForGuGuDan06 {
	public static void main(String[] args) {
		
		int i, j;		
		for(i=1; i<=9; i++) {			
			for(j=2; j<=9; j++) {
				
				System.out.printf("%d*%d=%2d ", j,i,i*j);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		for(i=1; i<=9; i++) {			
			for(j=10; j<=15; j++) {				
				System.out.printf("%d*%d=%3d ", j,i,i*j);
			}
			System.out.println();
		}

	}

}
