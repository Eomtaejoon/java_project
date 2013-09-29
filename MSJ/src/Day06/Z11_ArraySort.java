package Day06;
public class Z11_ArraySort {
	public static void main(String[] args) {
		int i, j, temp,	total;
	    int[] dim = {56, 78, 65, 46, 89, 39, 36, 45, 81, 22};
		
	    System.out.println("배열의 초기 형태");
		for(total = 0;total < 10;total++)
			System.out.print(dim[total] + " ");
		
		System.out.println();
		System.out.println("=================================");			
		
		for(i = 0;i < 10;i++)	
		{
			for(j = i+1;j < 10;j++) 
			{
				if(dim[i] > dim[j]) {					
					temp = dim[i];					
					dim[i] = dim[j];					
					dim[j] = temp;
				}
			}
			System.out.print(i+ "-> ");
			for(total = 0;total < 10;total++)
				System.out.print(dim[total] + " ");

			System.out.println();
		}
	}
}







