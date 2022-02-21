package loops_arrays;

public class App2 {
	public static void main(String[] args) {
		int[] arry = new int[] {1,2,3,4,5,6,7};
		
	 
		for(int i=0;i<arry.length ; i++ ) { 
			System.out.print(arry[i] + " "); 
		}
		
		System.out.println("\n***************\n");
		for(int i=arry.length-1 ; i>=0 ; i--) { 
			System.out.print(arry[i] + " ");
		}
		
		System.out.println("\n***************\n");
		for(int temp : arry) {
			System.out.print(temp + " ");
		}
		
		
		System.out.println("\n***************\n");
		 for( int i=0;i<arry.length ;i++) { 
			 
			 if(arry[i] % 2 == 0) {
				 System.out.print(arry[i] + " ");
				 continue;
			 }
			 
			 if(arry[i] == 5) 
				 break;
		 }
		 
		 System.out.println("\n***************\n");
		 int i=0;
		 while(i<arry.length) { //0--->5
			 System.out.print(arry[i] + " ");
			 i++;
		 }
		 
		 
		
	}
}








