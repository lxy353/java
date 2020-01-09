package cn.lxy;

public class Test1 {
	public static void main(String[] args) {
		int[] arr01 =new int[10];
		String[] arro2 = new String[5];
		User[] arr03= new User[3];
		
		arr03[0]=new User(1001,"xixi");
		arr03[1]=new User(1001,"xi1xi");
		arr03[2]=new User(1001,"xi2xi");
		for(int i=0;i<arr03.length;i++) {
			System.out.println(arr03[i].getName());
		
		}
		
		for(int i=0;i<arr01.length;i++) {
			arr01[i]=10*i;
		}
		for(int i=0;i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
	}
}
		
