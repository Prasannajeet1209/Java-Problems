package Oops;

public class Inheritance {

    public static void main(String[] args) {
    cat c1= new cat(); // object of cat class 
    c1.eats();         // methods of animal class
    c1.breath();
    }
}

class Animal {
    String name;

    void eats() {
        System.out.println("This Animal can eat");
    }

    void breath() {
        System.out.println("This Animal can breath");
    }
}

class cat extends Animal {
    void legs() {
        System.out.println("This Animal have 4 legs");
    }
}