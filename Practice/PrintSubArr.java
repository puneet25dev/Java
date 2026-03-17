package Practice;

public class PrintSubArr {
    public static void printArr(int numbers[]) {
        for(int i=0;i<numbers.length;i++){

            for(int j=i;j<numbers.length;j++){
                    System.out.print("[ ");


                for(int k=i;k<=j;k++){
                    if(k<j){
                        System.out.print(numbers[k]+ " , ");
                    }else{
                    System.out.print(numbers[k]);


                    }

                }
                System.out.print(" ]");
            System.out.println();

            }
            System.out.println();


        }
        

        
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,5,6,9};
        printArr(numbers);

    }
}
