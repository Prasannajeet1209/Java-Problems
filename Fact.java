package Function;

import java.util.Scanner;

public class Fact {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Find its Factorial : ");
        int n=sc.nextInt();
        
        System.out.println("factorial is equal to : "+factorial(n));
        }
    
}
