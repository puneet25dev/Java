import java.util.*;
public class PalindromeNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int reverseNum=0;
        int temp=num;
        temp=Math.abs(temp);
        while (temp>0) {
            int rem=temp%10;
             reverseNum=reverseNum*10+rem;
             temp=temp/10;
            
            
        }
        if(Math.abs(num)==reverseNum){
            System.out.println(num + " is palindrom");
        }else{
            System.out.println(num + " is not Palindrome");
        }
        sc.close();
    }
}