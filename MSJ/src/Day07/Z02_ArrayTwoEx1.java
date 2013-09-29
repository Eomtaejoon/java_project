package Day07;
public class Z02_ArrayTwoEx1 {
	public static void main(String[] args) {
		
		int[][] ary = new int[3][4];
		int cnt = 1; 
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				
				ary[i][j] = cnt++; 
				System.out.println(ary[i][j]);
			}
			
		}
		
		
	}
}
