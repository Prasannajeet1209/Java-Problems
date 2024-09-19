

public class powerFunction {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int sum=x*power(x,n-1);
        return sum;
    }

    public static void main(String args[]){
        int n=10;
        int x=2;
        System.out.println(power(x,n));
    }
}

// step qustion 
