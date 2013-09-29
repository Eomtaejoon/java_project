package Day09;
public class Calc {	
	private int x, y, z;
	
	public void setXYZ(int n1, int n2, int n3) {		
		x = n1;
		y = n2;
		z = n3;
	}	
	private void add() {		
		System.out.println( x+y+z );
	}	
		
	public void ptr() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
}
