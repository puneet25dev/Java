import java.util.*;

public class CheckPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether is it prime or not");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Enter positive num");
        }

        if (num > 0) {
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num % i==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(num + " is prime");
            }else{
                System.out.println(num +" is not prime");
            }
        }
        sc.close();

    }

}
