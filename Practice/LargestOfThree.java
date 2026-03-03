package Practice;
import java.util.*;
public class LargestOfThree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ist Number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2=sc.nextInt();
        System.out.println("Enter 3rd Number");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3) {
            System.out.println(num1 + " is largest among "+ num2+ ","+num3);
        } else if(num2>num3) {
            System.out.println(num2 + " is largest among "+ num1+ ","+num3);
        } else {
            System.out.println(num3 + " is largest among "+ num1+ ","+num2);
        }
        sc.close();
    }
}
