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
				System.out.println("3000�� �Դϴ�.");
				break;
			}			
		}
		System.out.println("�ݺ��� ����������!");
	}
}
