package Day06;
public class Z06_Array06 {

	public static void main(String[] args) {
		int i;
		int[] sqrAry = new int[5];

		for (i = 0; i < 5; i++) 
			sqrAry[i] = i * i;

		System.out.println("Element Square");
		System.out.println("======  ======");
		
		for (i = 0; i < 5; i++)
			System.out.println("  " + i + "      " + sqrAry[i]);
	}

}
