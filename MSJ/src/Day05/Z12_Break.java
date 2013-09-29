package Day05;
public class Z12_Break {

	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(;;)
		{
			cnt+=2;
			System.out.println(cnt);
			
			if( cnt == 3000 )
			{
				System.out.println("3000번 입니다.");
				break;
			}			
		}
		System.out.println("반복을 빠져나오다!");
	}
}
