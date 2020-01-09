
public class Test {
  public static void test01(AA aa){
	  System.out.println("#########################################################");
	  aa.aa();
  }
  public static void main(String[] args) {
	  Test.test01(new AA() {
		public void aa() {
			System.out.println("11");
		}
	  });
  }
}

interface AA{
	void aa();
}

