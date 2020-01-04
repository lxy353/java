
public class Hw {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			long result;
			result = digui(40);
			System.out.println("The 40 number is ：" + result);

		}
		static long digui(int n) {
			long result;
			if(n == 1 || n == 2) {
				result = 1;
			}
			else {
				result = digui(n-1) + digui(n-2);
			}
			return result;
		}
}
