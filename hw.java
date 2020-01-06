
interface  Movie{				
	public abstract void showMovie();
}
interface TV{				
	public abstract void showTV();
}
interface Song{				
	public abstract void singSong();
}
class Actor implements Movie,TV,Song{	

	public Actor(String name) {
		System.out.println("大家好我是" + name);
	}
	
	public void showMovie() {
		System.out.println("我能演电影");
	}
	public void showTV() {
		System.out.println("我能眼电视剧");
	}
	public void singSong() {
		System.out.println("我会唱歌");
	}
}
public class hw {
    public static void main(String[] args) {
    	Actor a = new Actor("杨幂");
    	a.showMovie();
    	a.showTV();
    	a.singSong();
    }
}
