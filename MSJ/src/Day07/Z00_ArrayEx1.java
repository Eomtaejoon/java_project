package Day07;
public class Z00_ArrayEx1 {
	/**
	 * 배열 길이 구하는 방법
	 */
	public static void main(String[] args) {
		int[] ary = new int[10];
		ary[3] = 3;
		ary[4] = 4;

		for(int i = 0; i < ary.length; i++){
			System.out.println(ary[i]);
		}
		System.out.println("------------------");
		
		String[] sqr = {"A","B","C","D","E"};
		
		for(String i : sqr) {
			System.out.println(i);
		}			
		/*for(int i = 0; i < sqr.length; i++){
		    System.out.println(sqr[i]);
		}*/
	}
}








