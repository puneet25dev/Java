package Practice;

import java.util.*;

public class CheckPalindromNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int temp=num;
        temp=Math.abs(temp);
        int ans=0;
        while(temp>0){
            int rem=temp%10;
            ans=ans*10+rem;
            temp=temp/10;
        }
        if(ans==Math.abs(num)){
            System.out.println(num + " is palindrom");
        }else{
            System.out.println(num + " is not Palindrom");
        }
        sc.close();


    }

}