package Pattern;

import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no");
        int row=sc.nextInt();
        for(int line=1;line<=row;line++){
            // for space
            for(int space=4;space>=line;space--){
                System.out.print("Space");
            }

            // for reverse num
            for(int j=line;j>=1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
