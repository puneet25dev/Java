package Series;
public class SeriesSix{
    public static void main(String[] args) {
        System.out.println("hello !");
        int n=2;
        int m=6;
        int diff=3;

        for(int i=1;i<11;i++){
            if(i%2!=0){
                System.out.print(n);
                n=n+n;
            }else{
                System.out.print(m);
                m=m+diff;
                diff++;
            }
            if(i<10){
                System.out.print(",");
            }
        }
        
    }
}