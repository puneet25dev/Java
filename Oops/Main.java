package Oops;

class Student {
    String name;
    int age;

    Student(String name, int age) {   
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Your age is " + age);
        System.out.println("Your name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student detail = new Student("Puneet", 30);
        detail.display();
    }
}