import java.util.Arrays;

/**
 * Test java.util.Arrays
 * @author lxz35
 *
 */
public class TestArrays {
	public static void main(String[] args) {
		
		int[] a = {100,20,30,5,102,200};
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));//help us to print array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); // sort the array
		
		System.out.println(Arrays.binarySearch(a, 30));//search the value's position in the array 
		
	}

}
