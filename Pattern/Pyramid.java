package Pattern;
import java.util.*;
public class Pyramid{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter row");
            int row=sc.nextInt();
            for(int i=1;i<=row;i++){
                for(int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i+(i-1);k++){
                    System.out.print("*");
                }
                
                
                System.out.println();
            }
        }
    }
}