

public class Factorial {

    public static int printfact(int n){
        if(n==1){
            return 1;
        }
        int fact =n+printfact(n-1);
        return fact;
    }
    public static void main(String arg[]){
        int n=5;
        System.out.println(printfact(n));

    }
}
