
import java.util.Arrays;

public class TestArrayTable {
	public static void main(String[] args) {
		Object[] emp1 = {1001,"lxt",18,"student","1111"};
		Object[] emp2 = {1002,"lt",18,"student","1111"};
		Object[] emp3 = {1003,"l",18,"student","1111"};
		
		Object[][] table = new Object[3][];
		table[0] = emp1;
		table[1] = emp2;
		table[2] = emp3;
		
		for(Object[]temp:table) {
			System.out.println(Arrays.toString(temp));
		}
		
		
		
	}

}
