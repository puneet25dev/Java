package Practice;
import java.util.*;

public class Series28 {
    public static void main(String[] args) {
        
        // 5,16,51,158
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght of series");
        int length=sc.nextInt();
        int diff;
        System.out.println("Enter first number");
        int firstNum=sc.nextInt();

        for(int i=1;i<=length*2;i=i+2){

            diff=2*firstNum+i;
            System.out.print(firstNum +" ");


            firstNum=firstNum+diff;


        



        }
        
    }
}
