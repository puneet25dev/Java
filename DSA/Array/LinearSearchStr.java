package DSA.Array;
import java.util.*;

public class LinearSearchStr{
    public static int findKey(String fruit[],String key){

        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equals(key)){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Search any key");
        String key=sc.next();
        String fruit[]={"apple","mango","fig","grapes","cherry"};
        int i=findKey(fruit, key);

        System.out.println("key found at "+ i);

    }
}