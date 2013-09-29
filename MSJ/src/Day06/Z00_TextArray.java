package Day06;
public class Z00_TextArray {
	public static void main(String[] args) {
		
		int[] ss = new int[5];
	
		for(int i=0; i<5; i++) {
			
			ss[i] = i*i;
			System.out.println("ss[" + i + "]" + "=" + ss[i]);
		}
		
		char[] c = new char[10];
		
		for(int i=0; i<c.length; i++) {
			c[i] = '*';
			System.out.print(c[i]);
		}
		
	}		
}
