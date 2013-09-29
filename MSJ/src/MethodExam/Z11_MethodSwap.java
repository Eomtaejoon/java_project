package MethodExam;
public class Z11_MethodSwap {

	static void SWAP(int x, int y) {		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("½º¿Ò ÈÄ");
		System.out.println("x: " + x);
		System.out.println("y: " + y);		
	}	
	public static void main(String[] args) {
		
		int x = 200, y = 100;
		
		SWAP(x, y);
		

	}

}
