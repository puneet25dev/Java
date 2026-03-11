package DSA.Array;

public class ReturnTrueForDuplicate {
    public static boolean returnDuplicate(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.println(numbers[i]+ "is duplicate");
                    return true;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,2};
        System.out.println(returnDuplicate(numbers));
    }

}
