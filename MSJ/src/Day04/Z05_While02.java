package Day04;
public class Z05_While02 {
	public static void main(String[] args) {
		int i = 0;	
		
		while( i <= 100 ) {
			System.out.println("i = " + i);
			i+=2; //i=i+2;
		}
		///////////////////////////////////////////////
		i = 0;		
		while( i <= 100 ) {
			
			if( i%2 == 0 )
				System.out.println("i = " + i);
		
			i++;
		}
		/////////////////////////////////////////
		i = 0;		
		while( i <= 100 ) {
			
			if( i%2 != 0 )
				System.out.println("i = " + i);
		
			i++;
		}
		i = 1;		
		while( i <= 100 ) {
			
			System.out.println("i = " + i);		
			i+=2;
		}
	}

}











