package Practice;

public class Series33 {

    public static void main(String[] args) {
        int diff;
        int k=0;
        int l=0;

        for (int i = 1; i < 11; i = i + 1) {


            if (i % 2!=0) {

                System.out.print(i+",");
                


            } else {

                    diff=2*l;
                    k=k+diff;
                    System.out.print(k+",");
                    l++;
                

            }

        }
    }

}
