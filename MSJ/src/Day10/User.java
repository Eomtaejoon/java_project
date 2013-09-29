package Day10;

public class User {
	
	private int n1;
	private int n2;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	public static void main(String[] arg) {
		User u = new User();
		
		u.setN1(10);
		System.out.println(u.getN1());
		
	}
	
}









