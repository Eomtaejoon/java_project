package Day03;
public class Z10_NestedIF {
	public static void main(String[] args) {
		
		/*int a = 1, b = 1, c = 1;
		
		if( a == b ) 
		{			
			if( b == c ) 
			{				
				System.out.println("a == c");				
			}
			else if( b != c ) 
			{
				System.out.println("a != c");
			}			
		}*/
		int n = 36;
		
		if( (n%2) == 0 ) 
		{			
			if( (n%3) == 0 ) 
			{
				System.out.println("¦���̸鼭 3�� ���");
			}
			
			if( (n%9) == 0 ) 
			{
				System.out.println("¦���̸鼭 9�� ���");
			}			
		}
		else 
		{
			System.out.println("Ȧ��~~~~~");
		}
	}
}




















