
public class Sum {
	public static void main(String[] args) {
        int sum = 0;
        int step = 0;
        for(int i = 0; i <= 100; i++){
            step += i;
            sum += step;
        }
        System.out.println("sum:"+sum);
    }


}
