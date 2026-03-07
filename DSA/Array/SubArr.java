package DSA.Array;

public class SubArr {
    public static void printSubArr(int numbers[]) {


        for(int i=0;i<numbers.length;i++){
            int sum=0;
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                System.out.print("[");
                for(int k=start;k<=end;k++){
                    sum+=numbers[k];
                    System.out.print(" "+numbers[k]+ " ");
                }
                System.out.print("] ");
                System.out.println(" <== Sum of this sub array is "+ sum);
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int numbers[]={11,22,33,43,54,63,17,38,29};
        printSubArr(numbers);

    }
}
