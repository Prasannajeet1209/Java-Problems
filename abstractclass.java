package Oops;

public class abstractclass {
    public static void main(String[] args) {
        meww c1= new meww(); // object of cat class 
        c1.eats();         // methods of animal class
        c1.breath();
        c1.walk();
        }
    }
    
    
   abstract class Animal {
        String name;
    
        void eats() {
            System.out.println("This Animal can eat");
        }
    
        void breath() {
            System.out.println("This Animal can breath");
        }
        abstract void walk();

        Animal(){
            System.out.println("Animal is calling ");
        }
    }
    
    class cat extends Animal {
        void legs() {
            System.out.println("This Animal have 4 legs");
        }

        void walk(){
            System.out.println("This Animal can walk");
        }
        cat(){
            System.out.println("cat is calling");
        }

    }

    class meww extends cat{
      meww(){
        System.out.println("meww is calling ");
      }
    }
