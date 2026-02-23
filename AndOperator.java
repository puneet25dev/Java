import java.util.*;
public class AndOperator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range from 1");
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            if(i%2==0 && i%3==0){
                System.out.println("even and multiple of 3 is=> "+i);
            }
        }
        sc.close();


    }
    
}
