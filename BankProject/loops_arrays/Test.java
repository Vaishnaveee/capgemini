package loops_arrays;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) {

		int[] x={2,5,1,3,7,4};
		System.out.println(x[2]);
		x[2] = 3;
		System.out.println(x[2]);
		 
		System.out.println(x.length); 
	
		int[] arry = new int[5];
		
		arry[0] = 4; 
		arry[1] = 2; 
		
		System.out.println(arry[2]); 
		
		
		int[] arry1 = new int[] {4,3,6,2,7,1};
		System.out.println(arry1[2]);
		System.out.println("\n==========================\n");
	
		int[] ary = new int[] {5,3,7,8,1};
		System.out.println("\n*****Before Sorting*****");
	
		for(int  temp:ary ) {
			System.out.print(temp + " ");
		}

		Arrays.sort(ary); 
		System.out.println("\n*****After Sorting*****");
		for(int  temp:ary ) {
			System.out.print(temp + " ");
		}
		
		System.out.println("\n*****Binary Searching*****");
		
		int index = Arrays.binarySearch(ary, 7);
		System.out.println(index);//3
		
		int index1 = Arrays.binarySearch(ary, 6);
		System.out.println(index1);
		
		int[] arry2 = {3,5,1,7,8};
		System.out.println(Arrays.binarySearch(arry2, 7));
	}
}












