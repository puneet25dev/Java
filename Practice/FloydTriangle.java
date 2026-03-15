package Practice;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no");
        int row=sc.nextInt();
        int count=0;
        for(int i=0;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;

            }
        System.out.println();


        }

    }
    
}
