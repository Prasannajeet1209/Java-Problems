package Oops;

public class OopsinJava {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prasannajeet";
        s1.roll = 211101070;
        s1.password = "12345";

        Student s2 = new Student();
        s2.password = "6789";
    }

}

class Student {
    String name;
    int roll;
    String password;

    Student() {
        System.out.println("Hello Oops");
    }

    // copy constru
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;

    }
}
