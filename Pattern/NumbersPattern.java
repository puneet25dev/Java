package Pattern;

import java.util.Scanner;

public class NumbersPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row =sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=i;j<=row+i;j++){
                
                System.out.print(j);
            }
            
            System.out.println();

        }
        sc.close();
    }
}
