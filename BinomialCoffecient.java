package Function;

import java.util.Scanner;

public class BinomialCoffecient {
   

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of N : ");
            int n=sc.nextInt();
            System.out.println("Enter value of R :");
            int r=sc.nextInt();
            int n_fact=factorial(n);
            int r_fact=factorial(r);
            int n_r_fact=factorial(n-r);
            int BinomialCoffecient=n_fact/(r_fact*n_r_fact);
            System.out.println(" BinomialCoffecient is : "+BinomialCoffecient);
        }
     
        }
    

    
}