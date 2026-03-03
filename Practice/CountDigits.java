package Practice;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int temp=Math.abs(num);
        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        System.out.println(num +" have "+ count + " digits");
        sc.close();
    }
}
