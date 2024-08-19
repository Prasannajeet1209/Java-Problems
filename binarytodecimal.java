package Function;

import java.util.Scanner;

public class binarytodecimal {

    public static void bintodec(int a){

        int pow=0;
        int dec=0;
        while(a!=0){
        int lastdigit = a%10;
        dec=dec+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        a=a/10;
    }
    System.out.println(dec);
}     




public static void dectobin(int a){
    int num=a;
    int pow=0;
    int dec=0;
    while(a!=0){
    int lastdigit = a%2;
    dec=dec+(lastdigit*(int)Math.pow(10,pow));
    pow++;
    a=a/2;
}
System.out.println("Binary form of "+num+"= "+dec);
}     

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a=sc.nextInt();
      //  bintodec(a);
          dectobin(a);
        
    }
    
}
