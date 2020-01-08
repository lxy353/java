
public class TestArray {
	
	public static void  main(String[] args){
		String[]  s1 = {"aa","bb","cc","dd","ee"};
		String[] s2 = new String[s1.length+10];
		
		System.arraycopy(s1, 0, s2, 0, s1.length);
		s2[s2.length-1]=null;
		
		for(String temp:s2) {
			System.out.println(temp);
	}
		
		System.arraycopy(s1, 0, s2, 5, 4);
		for(String temp:s2) {
			System.out.println(temp);
	}
	}
	
	public static void testBasicCopy() {
		String[]  s1 = {"aa","bb","cc","dd","ee"};
		String[]  s2 = new String[10];
		System.arraycopy(s1, 2, s2, 6, 3);
		
		for(int i=0;i<s2.length;i++) {
			System.out.println(i+"--"+s2[i]);
		}
	}
	//test delete = copy
	public static void testBasicCopy2() {
		String[]  s1 = {"aa","bb","cc","dd","ee"};
		//String[]  s2 = new String[5];
		System.arraycopy(s1, 3, s1, 3-1, s1.length-3);
		
		s1[s1.length-1]=null;
		
		for(int i=0;i<s1.length;i++) {
			System.out.println(i+"--"+s1[i]);
		}
	}
	
	//delete a element and return array
	public static String[] removeElment(String[] s ,int index) {
		
		//String[]  s2 = new String[5];
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		
		s[s.length-1]=null;
		
		for(int i=0;i<s.length;i++) {
			System.out.println(i+"--"+s[i]);
		}
		return s;
	}
	
	//==give a bigger array and copy
	public static void extendRange() {
		String[] s1= {"aa","bb","cc"};
		
		String[] s2 = new String[s1.length+10];
		
		System.arraycopy(s1, 0, s2, 0, s1.length);
		
System.arraycopy(s1, 0, s2, 4, s1.length+1);
		
		s2[s2.length-1]=null;
		
		for(String temp:s2) {
			System.out.println(temp);
		}
		
	}
	
	
	}
		
		
		
	

