package Practice;
import java.util.*;
public class ReverseNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=num;
        int ans=0;
        if(temp<0){
            temp=Math.abs(temp);

        }

        while(temp>0){

            int rem=temp%10;
            ans=ans*10+rem;
            temp=temp/10;

        }
        if(num<0){
        System.out.println(num + "->" + (-ans));

        }else{
        System.out.println(num + "->" + ans);

        }
        sc.close();
    }
}
