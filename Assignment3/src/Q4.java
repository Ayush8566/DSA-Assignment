public class Q4 {

	public static void main(String[] args) {

		Integer a[]= { 1,2,3,4,54,6};
		 Double b[]= {1.2,3.3,4.5,6.5,6.7,7.8};
		 
		  printArray(a);
		  printArray(b);
			
	
	

}

public static <E> void printArray(E[] inputArray) {
	 for( int i=0;i<inputArray.length;i++) {
		 System.out.print(inputArray[i]+" ");
	 }
	 System.out.println();
	
}

}