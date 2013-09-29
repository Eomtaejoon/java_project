package Day10;

public class userSUB {
	public int num1;
	public int num2;
	public int res;
	
	public void setNum(int x, int y ) {
		num1 = x;
		num2 = y;	
	}	
	public void subC() {
		res = num1 - num2;
		System.out.println(num1 + "-" + num2 + "=" + res);
	}
}
