package Series;

public class SeriesFour {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<8;i++){
            int term=(n*n*n)+n;
            System.out.print(term);

            if(i<7){
                System.out.print(",");
            }
            n++;
        }
    }
}
