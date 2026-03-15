package Practice;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row=sc.nextInt();

        for(int i=1;i<=row;i++){

            for(int space=1;space<=row-i;space++){
                System.out.print(" ");

            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            for(int k=i-1;k>0;k--){
                System.out.print(k);
                
            }
            System.out.println();

        }
    }
}
