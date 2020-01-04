import java.util.Scanner;
   public class bank {
	   public static void main (String[] args) {
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("The money:");
		   
		   double money = scanner.nextDouble();
		   double year1 = Math.round(money *1.0035);
		   double year2 = Math.round(money *1.0035*2);
		   double year3 = Math.round(money *1.015);
		   double year4 = Math.round(money *1.021);
		   
		   System.out.println("The money is :" + money);
		   System.out.println("The year1 is "+ year1);
		   System.out.println("The year2 is "+ year2);
		   System.out.println("The year3 is "+ year3);
		   System.out.println("The year4 is "+ year4);
		   
		   
	
	
}
}
