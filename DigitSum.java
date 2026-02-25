import java.util.*;
public class DigitSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp=Math.abs(num);
        int result=0;
        while(temp>0){
            int rem=temp%10;
            result+=rem;
            temp=temp/10;

        }
        System.out.println("The sum of entered digit is "+result);
        sc.close();
    }
}
