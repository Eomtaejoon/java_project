package Day10;

public class userDIV {
	public int num1;
	public int num2;
	public int res;
	
	public void setNum(int x, int y ) {
		num1 = x;
		num2 = y;	
	}	
	public void divC() {
		if( num2 == 0 ) {
			System.out.println("0으로 나눌수 없음.");
		}else {
			res = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + res);
		}
	}
}
