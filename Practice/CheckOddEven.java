package Practice;
import java.util.*;
public class CheckOddEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num =sc.nextInt();
        if((num/2)*2==num){
            System.out.println(num  + " is Even");
        }else{
            System.out.println(num  + " is Odd");
        }
        sc.close();

    }
}
