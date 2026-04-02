package Practice;

public class Series33 {

    public static void main(String[] args) {
        int diff;
        int k=0;
        for (int i = 1; i < 11; i = i + 1) {


            if (i % 2 == 0) {

                // System.out.print("*");
                diff=2*i-k;

                k=k+diff;
                System.out.print(k+ ",");


            } else {
                System.out.print(i + ",");

            }

        }
    }

}
