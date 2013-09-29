package Day10;
import java.util.Scanner;
public class DataTest {	
	private int sum;
	
	public void setsum(int s) {
		sum = sum + s;
	}
	public int getSum() {
		return sum;
	}	
	public static void main(String[] arg) {		
		Scanner scan = new Scanner(System.in);
		DataTest dt = new DataTest();
		
		for(int i=1; i<=10; i++) {
			System.out.print("정수 입력:");
			int n = scan.nextInt();			
			dt.setsum(n);			
		}	
		
		System.out.println(dt.getSum());
	} 
}







