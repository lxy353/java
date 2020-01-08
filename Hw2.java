import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		int count = 0 ;
		System.out.println("Give me a number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numArray = new int[50];		
		for(int i= 0;i < 50;i++) {			
			numArray[i] = (int)(n * Math.random());
			if(numArray[i] >= 60) {			
				count ++;
			}

				
	}
		Test2 t2 = new Test2();			
		t2.numTest(numArray);			
		System.out.println("超过60的有" + count + "个");

}
}
class Test2 extends BubbleSort{
	public static void numTest(int[] array) {
		bubbleSort(array);						
		System.out.println("最大数是：" + array[49] + "\n" + "最小数是：" + array[0]);
	}
}

class BubbleSort {
	public static void bubbleSort(int[] array) {
		int temp = 0;
		for(int i = array.length - 1;i > 0;i--) {
			boolean flag = true;
			for(int j = 0;j < i;j++) {
				if(array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = false;
				}
			}
			if(flag) {
				break;
			}
		}
	}
}

