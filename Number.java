import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me 4 digit number");
		int num = scanner.nextInt();
		int units = num % 10;					
		int tens = (num % 100) / 10;			
		int hundreds = (num % 1000) / 100;		
		int thousands = num / 1000;			
		int units1 = (units + 5) % 10;
		int tens1 = (tens + 5) % 10;
		int hundreds1 = (hundreds + 5) % 10;
		int thousands1 = (thousands + 5) % 10;
		
		 int temp;								
		 temp = units1;
		 units1 = thousands1;
		 thousands1 = temp;
		 temp = tens1;
		 tens1 = hundreds1;
		 hundreds1 = temp;
		 int num1 = units1 + tens1 * 10 + hundreds1 * 100 + thousands1 * 1000; 
		 System.out.println("The number after:"+num1);


	}

}
