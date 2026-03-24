package Practice;

import java.util.Scanner;

public class TcsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial number");

        int num1 = sc.nextInt();
        System.out.println("Enter last number");

        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {

            int number = i;
            int lastDigit = number % 10;
            int temp = number;
            Boolean isSame = true;

            while (temp > 0) {

                if (temp % 10 != lastDigit) {
                    isSame = false;
                    break;
                }
                temp = temp / 10;

            }
            if (isSame) {
                System.out.println("digits are same of " + number);
            } else {
                System.out.println("Digits are not same of " + number);
            }
        }

    }

}