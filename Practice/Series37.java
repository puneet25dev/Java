package Practice;
import java.util.*;

public class Series37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of series");
        int length = sc.nextInt();

        int firstNum = 11;
        int diff = 9;

        System.out.print(firstNum + " ");

        for(int i = 1; i < length; i++){

            firstNum = firstNum + diff;
            System.out.print(firstNum + " ");

            diff = diff * 2;
        }
    }
}