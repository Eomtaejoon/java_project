package Day05;
public class Z06_For04 {

	public static void main(String[] args) {
		
		//int i, j;
		int cnt = 0;
		for(int i=1; i<=10; i++) 
		{
			for(int j=1; j<=10; j++) 
			{
				cnt++;
				System.out.println(cnt);
			}
		}
		System.out.println("=================================");
		
		for(int i=1; i<=10; i++) 
		{
			for(int j=1; j<=10; j++) 
			{
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}

}












