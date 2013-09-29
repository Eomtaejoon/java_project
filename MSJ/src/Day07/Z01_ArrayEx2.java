package Day07;
public class Z01_ArrayEx2 {
	/**
	 * 배열 복사하는 방법
	 */
	public static void main(String[] args) {
		String[] ary = {"1월","2월","3월"};// 0,1,2
		String[] sqr = new String[ary.length + 1];//0,1,2,3

//(원본배열,복사를 시작할 원본 요소위치(숫자), 복사할 배열 , 복사를 받을 때 위치, 원본배열.length);
		System.arraycopy(ary, 0, sqr, 0, ary.length);
		sqr[3] = "4월";
		
		System.out.print("sqr[]: ");
		for(int i=0; i<sqr.length; i++)
			System.out.print(sqr[i]);
		
		System.out.println();
		System.out.println("=================");
		ary = sqr; //배열 복사		
		
		System.out.print("ary[]: ");
		for(int i = 0; i < ary.length ; i++){
			System.out.print(ary[i]);
		}

	}

}









