package Day06;

public class Z05_Array05 {

	public static void main(String[] args) {
		
		int[] ary = new int[5];
		
		for(int i=0; i<5; i++) {
			
			ary[i] = i*i;
			System.out.println("ary[" + i + "] = " + ary[i]);
		}

	}

}
