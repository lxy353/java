import java.util.Arrays;
import java.util.Scanner;
public class Hw1 {
	public static void main(String[] args) {
		String[] str = new String[10];
		for(int i = 0;i < 10;i++) {	
			System.out.println("Give me a value");
			Scanner scanner = new Scanner(System.in);
			String str1 = scanner.nextLine();
			
			str[i] = str1;
		}
	
			System.out.println("Give me a world");
			Scanner scanner = new Scanner(System.in);
			String str1 = scanner.nextLine();
			
			
			isExist(str,str1);	
		}
		

	private static void isExist(String[] str, String str1) {		   
			boolean flag = true;
			for(int i = 0;i < str.length;i++) {
				if(str[i].equals(str1)) 
					System.out.println("Yes");
					flag = false;
				}
			
			if(flag) {
				System.out.println("No");
			}
	}
}



