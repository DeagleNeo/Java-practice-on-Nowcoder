import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //write your code here........
        
        // Method 1
        // long [] numbers = new long[10];
        // for (int i = 1; i <= 10; i++) {
        //     numbers[i-1] = (long) Math.pow(10, i) - 1;
        // }
        // long sum = Arrays.stream(numbers).sum();
        // System.out.println(sum);

        // Method 2
        long sum = 0;
        long [] numbers = new long[10];
        for (int i = 1; i <= 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                sb.append("9");
            }
            numbers[i-1] = Long.parseLong(sb.toString());
        }
        for (long num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
