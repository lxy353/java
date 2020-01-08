import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[]arr= {30,20,50,10,80,97,100};
		Arrays.sort(arr);
		int value =10;
		System.out.println(Arrays.toString(arr));
		System.out.println(myBinnartSearch(arr,40));
		
		

}


 public static int myBinnartSearch(int[]arr, int value) {
	 int low = 0;
		int high = arr.length-1;
		
		while(low <=high) {
			int mid = (low+high)/2;
			
			if(value == arr[mid]) {
				return mid;
			}
			if(value > arr[mid]) {
				low = mid +1;
				
			}
			if(value < arr[mid]) {
				high  = mid -1;
			}	
		}
		return -1;
	}
 }
 
