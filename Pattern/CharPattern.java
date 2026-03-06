package Pattern;

public class CharPattern {
    public static void main(String[] args) {
        int count=0;
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=1;i<7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alphabet.charAt(count));
                count++;
            }
            System.out.println();
        }
    }
}
