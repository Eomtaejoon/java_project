package Day04;
public class Z04_While01 {

	public static void main(String[] args) {
		
		int i=0; //�ʱⰪ
		
		while( i<=10 ) { //�ݺ� ���ǽ�
			
			System.out.println("i = " + i); //���๮��
			
			i++; //������.. i=i+1;
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













