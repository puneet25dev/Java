package DSA.Array;

public class FnArgsArr {

    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {89, 76, 87};

        int oldMarks[] = marks.clone();

        update(marks);

        System.out.println("Old Value  -> New Value");
        for(int i = 0; i < marks.length; i++){
            System.out.println(oldMarks[i] + " -> " + marks[i]);
        }
    }
}