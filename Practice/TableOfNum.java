package Practice;
import java.util.*;
public class TableOfNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table number");
        int num=sc.nextInt();
        int table=1;

        for(int i=1;i<=10;i++){
             table=num*i;
             System.out.println(num +" * "+ i + " = " + table);
        }

        sc.close();
    }
}
