package Day02;

public class Z01_BooleanTest {
	public static void main(String[] args) {
		
		boolean b;

		b = true;
		System.out.println("b : " + b);
		
		b = ( 1 > 2 );
		System.out.println("b : " + b);
		
		int a = 100;
		
		a = ~a + 1;
		System.out.println(a);

		int x = 2;
        int y = 3;


        System.out.println((x & y)); //AND
        System.out.println((x | y)); //OR


        System.out.println((x ^ y)); //XOR 같으면 0 틀리면 1
        System.out.println(~x);

	}

}
