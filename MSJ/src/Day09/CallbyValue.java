package Day09;

public class CallbyValue {
	
	public int speed = 100;
	
	public void speedUP(int s) {
		speed += s;
		System.out.println("s: " + s);
		System.out.println("speed" + speed);
	}
	
}
