import java.util.Scanner;

public class Calc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter operator");
        String op = sc.next();
        switch (op) {
            case "+":
                int add = a + b;
                System.out.println(" The sum is " + add);
                break;
            case "-":
                int sub = a - b;
                System.out.println(" The sub is " + sub);
                break;
            case "*":
                int mul = a * b;
                System.out.println(" The mul is " + mul);
                break;
            case "%":
                int mod = a % b;
                System.out.println(" The mod is " + mod);
                break;
            case "/":
                int div = a / b;
                System.out.println(" The div is " + div);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}