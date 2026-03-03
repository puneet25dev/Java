package Pattern;
import java.util.*;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            // loop for space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            // loop for numbers
            for(int j=1;j<=i;j++){
                System.out.print((j));
            }
            // loop for decreasing number
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}
