package Oops;

class Student {
    String name="Punnet";
    int age=30;

    void display(){
        System.out.println("Your age is "+ age);
        System.out.println("Your name is "+ name);

    }
}

public class Main{
    public static void main(String args[]){
        Student detail=new Student();
        detail.display();
    }
}