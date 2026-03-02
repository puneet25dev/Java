package DSA.Array;

import java.util.Scanner;

public class LinearSearch {
    public static int searcher(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 34, 45, 23, 65, 76, 12, 30, 66 };
        System.out.println("Enter any key to find it index");

        int key = sc.nextInt();
        int i = searcher(arr, key);
        if (i == -1) {
            System.out.println("Couldn't find the index");
        } else {
            System.out.println("Key at index: " + i);

        }
        sc.close();

    }
}
