/**
 * 
 * TestAntoBox
 * @author lxz35
 *
 */
public class TestAntoBox {
	public static void main(String[] args) {
		Integer a =234;//Integer a = Integer.valueof(234);
		
		int b = a;//b=a.intvalue
		
		Integer c = null;
//		if(c!=null) {
//		 int d = c;//c.intvalue				
//	}
		
		
		
		Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为123在缓存范围内
        System.out.println(in1.equals(in2));//true
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true
	}

}
