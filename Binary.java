import java.util.Scanner;
 
public class Binary {
    public static void main(String[] args) {
        int decimal;
        String Sbinary;
        int  binary;
 
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number:");
        decimal = input.nextInt();
        Sbinary = Integer.toBinaryString(decimal);
        binary  = Integer.parseInt(Sbinary);
        System.out.printf("The number is :%d",binary);
 
    }
}
