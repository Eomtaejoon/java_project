package Day04;
public class Z07_While04 {

	public static void main(String[] args) {
		int i = 1;
		int even = 0, odd = 0;
		
		while(i<=100) {
			
			if( i%2 == 0 )
				even = even + i;
			else
				odd = odd + i;
			
			i++;
		}
		System.out.println("Â¦¼öÀÇ ÇÕ: " + even);
		System.out.println("È¦¼öÀÇ ÇÕ: " + odd);
	}
}
