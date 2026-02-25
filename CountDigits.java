import java.util.*;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = sc.nextLong();
        System.out.println();

        int count = 0;
        long temp = Math.abs(num);

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("The total digits in number are " + count);
        sc.close();
    }
}