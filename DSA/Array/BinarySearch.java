package DSA.Array;

import java.util.Scanner;

public class BinarySearch {
    public static int findKey(int number[],int key){

        int start=0;
        int end=number.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(number[mid]==key){
                return mid;
            }

            if(number[mid]>key){
                 end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number[]={2,4,6,8,10,12,14,16};
        System.out.println("Enter any key");
        int key=sc.nextInt();
        int i=findKey(number,key);

        System.out.println("key found at index "+ i);
        sc.close();
    }
}
