package DSA.Array;

public class LargestInArr {
    public static int findLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
                

            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[]={2,45,56,34,54,23,32,87,65,44,31};
        System.out.println("Largest number in array is: "+ findLargest(number));

    }
}
