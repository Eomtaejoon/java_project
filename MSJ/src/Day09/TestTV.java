package Day09;

public class TestTV {
	int hour;
	int min;
	int sec;	
	
	public static void main(String[] args) {		
		TestTV[] tv = new TestTV[3];
		
		for(int i=0; i<3; i++) {
			tv[i] = new TestTV();
		}
		
		tv[0].hour = 8;
		tv[0].min = 10;
		tv[0].sec = 5;
		
		tv[1].hour = 8;
		tv[1].min = 10;
		tv[1].sec = 5;
		
		tv[2].hour = 8;
		tv[2].min = 10;
		tv[2].sec = 5;
				
		for(int i=0; i<3; i++) {
			System.out.println(tv[0].hour);
			System.out.println(tv[0].min);
			System.out.println(tv[0].sec);			
		}		
	}
}
