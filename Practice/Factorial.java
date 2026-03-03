package Practice;
// Program to calculate factorial

import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to know factorial");
        int num = sc.nextInt();
        int result = 1;
        if (num < 0) {
            System.out.println("Enter postive number");
            
            
        } else {
            for (int i = num; i >= 1; i--) {
                result = result * i;

            }
        }
        System.out.println(result);
        sc.close();
    }
}
