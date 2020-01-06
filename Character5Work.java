package com.lxy;
class Instrument{					
	public void makeSound() {
		System.out.println("11");
	}
}
class ErHu extends Instrument{		
	public void makeSound() {
		System.out.println("erhu");
	}
}
class Piano extends Instrument{		
	public void makeSound() {
		System.out.println("piano");
	}
}
class Violin extends Instrument{	
	public void makeSound() {
		System.out.println("violin");
	}
}
class Musician{						
	public void play(Instrument m) {
		m.makeSound();
	}
}
class TestInstrument{				
	public void test(String musicianName,Instrument i) {
		System.out.print(musicianName);
		Musician musician = new Musician();
		musician.play(i);
	}
}
public class Character5Work {
    public static void main(String[] args) {
        TestInstrument t1 = new TestInstrument();
    	Instrument i = new Piano();
    	t1.test("lxy", i);
    }
}
