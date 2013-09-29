package Day04;
public class Z08_While05 {
	public static void main(String[] args) {
		
		int i = 1;
		int lineCnt = 0;
		
		while( i<=100 ) {
			
			if(lineCnt < 10 ) {
				lineCnt++;				
			}
			else {
				System.out.println();
				lineCnt = 1;
			}			
			System.out.print(i + " ");
			i++;
		}	
				

	}

}
