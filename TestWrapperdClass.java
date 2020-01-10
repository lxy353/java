/**
 * TestWrappedclass
 * @author lxz35
 *
 */
public class TestWrapperdClass {
	public static void main(String[] args) {
		
/**		//basic date type Conversion wrapped class
		Integer a = new Integer(3);
		Integer b = new Integer(10);
		Integer c = Integer.valueOf(30);
		
		//wrapped class Conversion basic date type
		int d=c.intValue();
		double e = c.doubleValue();
		
		//string class Conversion wrapped class
		Integer f = new Integer("9999");
		Integer g = Integer.parseInt("111");
		
		//...
		String str = f.toString();
		
		//constent
		System.out.println("biggest int"+ Integer.MAX_VALUE);
		
	
		**/
		Double a = new Double (3.0);
		Double b = Double .valueOf(20.1);
		
		Double c =b.doubleValue();
		
		Double d = new Double("10.222");
		Double e = Double.parseDouble("1111.111");
		
		String str = e.toString();
		System.out.println("biggest double " + Double.MAX_VALUE);
	}

}
