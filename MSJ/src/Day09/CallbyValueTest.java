package Day09;
public class CallbyValueTest {
	
	public static void main(String[] args) {
		CallbyValue cbv = new CallbyValue();
		
		int s = 50;
		
		cbv.speedUP(s);
		
		s = s + 10;
		
		System.out.println("s: " + s);
		
		
		
		

	}

}
