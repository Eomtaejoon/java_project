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
				System.out.println("짝수이면서 3의 배수");
			}
			
			if( (n%9) == 0 ) 
			{
				System.out.println("짝수이면서 9의 배수");
			}			
		}
		else 
		{
			System.out.println("홀수~~~~~");
		}
	}
}




















