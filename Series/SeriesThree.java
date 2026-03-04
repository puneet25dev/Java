package Series;

import java.util.Scanner;

public class SeriesThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of first num");
        int a =sc.nextInt();

        System.out.println("Enter value of Second num");
        int b =sc.nextInt();
        System.out.print(a + ","+b);
        for (int i = 1; i <= 6; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(","+c );

        }
        sc.close();
    }
}
