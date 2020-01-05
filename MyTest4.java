import  java.util.Scanner;
public class MyTest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("What do you like ：");
        String  favor = scanner.nextLine();
        System.out.println("How old are your：");
        int   age = scanner.nextInt();
         
        System.out.println("###############");
        System.out.println(name);
        System.out.println(favor);
        System.out.println("come to the earth："+age*365);
        System.out.println("the day leave the earth："+(72-age)*365);
	}

}
