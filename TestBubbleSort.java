import java.util.Arrays;

public class TestBubbleSort {
  public static void main(String[] args) {
	  int[] values = {2,1,6,3,9,0,7,4,5,8,11};
	  int temp=0;
	  for(int i=0;i<values.length-1;i++) {
	  for(int j =0; j<values.length-1;j++) {
		  
		  if(values[j]>values[j+1]) {
			  temp=values[j];
			  values[j]=values[j+1];
			  values[j+1]=temp;
			  
		  }
		  
		  System.out.println(Arrays.toString(values));
	  }
	
}
  }
}
 
