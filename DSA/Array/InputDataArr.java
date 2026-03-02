package DSA.Array;
import java.util.*;
public class InputDataArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[4];
        System.out.println("Enter Engilsh Marks::");
        marks[0]=sc.nextInt();

        System.out.println("Enter Hindi Marks::");
        marks[1]=sc.nextInt();

        System.out.println("Enter Maths Marks::");
        marks[2]=sc.nextInt();

        System.out.println("English: "+ marks[0]);
        System.out.println("Hindi: "+ marks[1]);
        System.out.println("Maths: "+ marks[2]);

        int res=marks[0]+marks[1]+marks[2];
        System.out.println("Total Marks : "+res);
        
        sc.close();


    }
}
