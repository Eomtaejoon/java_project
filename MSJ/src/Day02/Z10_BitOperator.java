package Day02;

public class Z10_BitOperator {
	
	public static void main(String[] args) {
		int x = 2;
        int y = 3;

        System.out.println( (x & y) ); //AND 연산
        System.out.println( (x | y));  //OR 연산

        System.out.println( (x ^ y));  //XOR  같으면 0 틀리면 1
        System.out.println(  ~x  );    //1의보수
        

	}

}
