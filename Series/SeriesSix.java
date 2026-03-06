package Series;

public class SeriesSix {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        for (int i = 1; i < 12; i++) {
            if (i % 2 == 0) {

                    System.out.print("*");
                    System.out.print(",");

                
            } else {
                int c = a + b;
                a = c;
                b = c;
                System.out.print(c);
                if (i < 11) {
                    System.out.print(",");
                }

            }

        }

    }
}
