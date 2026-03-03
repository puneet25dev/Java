package DSA.Array;

public class MinInArr {
    public static int findSmallest(int number[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(smallest>number[i]){
                smallest=number[i];
                

            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[]={2,45,56,34,54,23,32,87,65,44,31};
        System.out.println("Largest number in array is: "+ findSmallest(number));

    }
}
