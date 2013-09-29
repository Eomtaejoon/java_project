package Day10;
public class Shape {	
	private double d1, d2, r;
	private int n1,n2, s;
	
	
	public double getd1() { return d1; 	}
	public double getd2() {	return d2;	}
	public double getr() {	return r; 	}	
	
	public void setD(double x, double y) {	d1 = x; d2 = y;	}	
	public void setR(double x) { r = x; }
 	
	public double calcAreaRectangle() {	return d1 * d2;	}
	public int calcAreaRectangle2() {	return n1 * n2;	}
	
	public double calcAreaCircle() { return r*r*3.14159265;	}
	public double calcTriangle() {	return (d1*d2)/2; }
	
	
}







