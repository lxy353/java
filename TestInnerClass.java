
public class TestInnerClass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}

}

class Outer{
	private int age =10;
	
	public void testOuter() {
		System.out.println("11");
	}
	class Inner{
		int age = 10;
		public void show() {
			int age = 30;
			System.out.println("age:"+Outer.this.age);
			System.out.println("age:"+this.age);
			System.out.println("age:"+age);
			
		}
		
	}
}