package Pattern;
import java.util.*;
public class HollowRectangle {
    public static void main(String args[]){
        System.out.println("Enter how many row do you want to print");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        System.out.println("Enter no of column");
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||i==row||j==1||j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
