import java.util.*;
public class TernaryOperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println(age>18 ?"Eligible for vote" : "Wait till 18 to vote");
        sc.close();
    }

    
}
