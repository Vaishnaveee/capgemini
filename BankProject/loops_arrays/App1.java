package loops_arrays;

public class App1 {
	public static void main(String[] args) {
		
		int[][] arry = new int[2][3];
		System.out.println(arry); 
		System.out.println(arry[1]);
		
		arry[0][0] =4;
		
		arry[0][2]=2;		   

		arry[1][1]=1;	  
		
		for(int[] a : arry) { 
			for(int temp : a) { 
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n********************\n");
		
	
		int[][] arr = new int[2][];
		
		arr[0] = new int[] {1,2,3}; 
		arr[1] = new int[] {1,2};	
		
		for(int[] a : arr) { 
			for(int temp : a) { 
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		
		int[][] arr1 = new int[][] {{1,2},{3,4},{5,6} };
		
		System.out.println(arr1[1][1]); 
		
		
	}
}











