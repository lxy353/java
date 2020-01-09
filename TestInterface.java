
public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		v.fly();
		
		Honest h = new GoodMan();
		h.helpOther();
	}

}


interface Volant{
	int FLY_HEIGHT = 1000;
	void fly();
	
}
interface Honest{
	void helpOther();
	
}

 class Angel implements Volant,Honest{//duo jiekou
	
	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}
	
	public void fly() {
		System.out.println("Angel.fly()");
	}
	
}

class GoodMan implements Honest{
	
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");
	}
}