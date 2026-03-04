package Series;

public class SeriesOne {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);

        int num=11;
        System.out.print(num);

        for(int i=1;i<=6;i++){
            if(i%2==0){
                num+=4;

            }else{
                num+=2;
            }
        System.out.print(","+num);

        }
            
        }
    }

