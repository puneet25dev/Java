package Practice;
import java.math.BigInteger;
import java.util.*;
public class Digitcnt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        BigInteger num=sc.nextBigInteger();
        int count=String.valueOf(num).length();
        
        System.out.println(count);
        sc.close();
    }
}
