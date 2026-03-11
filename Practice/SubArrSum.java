package Practice;

public class SubArrSum {

    public static int printSubArrSum(int arr[]) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                System.out.print("[");

                for (int k = i; k <= j; k++) {

                    sum += arr[k];

                    if (k < j) {
                        System.out.print(arr[k] + ", ");
                    } else {
                        System.out.print(arr[k]);
                    }

                }

                System.out.print("]");
                System.out.println(" <=== Sum = " + sum);

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,-5,6,7,-8,-9};
        printSubArrSum(arr);

    }
}