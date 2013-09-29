package Day06;
public class Z12_ArrayHisto {
	public static void main(String[] args) {
		int[] histogram = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1}; 
		int	i, j;

		System.out.println("Element  Value  Histogram");
		
		for(i = 0; i < 10; i++)
		{
			System.out.print(i + "        " + histogram[i] + "     ");
			
			for(j = 0; j < histogram[i]; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}
