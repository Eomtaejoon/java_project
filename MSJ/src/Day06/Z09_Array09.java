package Day06;
public class Z09_Array09 {
	public static void main(String[] args) {
		
		int[] num = {1,2,3,55,66,77,33,22,33,44,55,66,77,889,43,22,44,1,2,3,55,66,77,33,22,33,44,55,66,77,889,43,22,44,1,2,3,55,66,77,33,22,33,44,55,66,77,889,43,22,44};
		int tot = 0;
		//int size = sizeof(num) / sizeof(int); 
				
		for(int i=0; i<num.length; i++)
		{
			tot += num[i];
		}
		System.out.println(tot);
		

	}

}
