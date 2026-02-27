package Pattern;
import java.util.*;

public class StarPattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j;
        int row;
        System.out.println("Enter row");
        row=sc.nextInt();
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
