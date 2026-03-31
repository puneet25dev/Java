package Practice;

import java.util.*;

public class SecondlargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array!");
        int n = sc.nextInt();
        int [] savedArr=new int[n];


        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value of array at index "+ i );
            arr[i]=sc.nextInt();
            savedArr[i]+=arr[i];

        }

        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<savedArr.length;i++){
            // int num[]=new int[savedArr.length];

            if(savedArr[i]>first){
                
                second=first;

                first=savedArr[i];

            }

        }
        System.out.println(second);
        
       
        

    }
}