package Day04;
public class Z06_While03 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while( i<=100 ) {
			
			sum = sum + i;
			i++;			
		}
		System.out.println("sum = " + sum);	
		////////////////////////////////////////
		i = 0;
		sum = 0;		
		while( i<=100 ) {
			
			if( i%2 == 0)
				sum = sum + i;
			
			i++;			
		}
		System.out.println("sum = " + sum);
		//////////////////////////////////////
		i = 0;
		sum = 0;		
		while( i<=100 ) {
			
			if( i%2 != 0)
				sum = sum + i;
			
			i++;			
		}
		System.out.println("sum = " + sum);

	}

}











