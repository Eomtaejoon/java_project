package Day04;
public class Z04_While01 {

	public static void main(String[] args) {
		
		int i=0; //초기값
		
		while( i<=10 ) { //반복 조건식
			
			System.out.println("i = " + i); //실행문장
			
			i++; //증감식.. i=i+1;
		}
		////////////////////////////////////////////
		
		int j = 0;
		
		while( true ) {
			
			System.out.println("j = " + j);
			
			if( j == 10 ) 
				break;
			
			j++;	
			
		}
		
	}
}













