

public class fibonacciNumber {
    public static int fib(int n){
        if(n==0 ||n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fact = f1+f2;
        
        return fact;
    }
    public static void main(String arg[]){
        int n=26;
        System.out.println(fib(n));

    }
}

