package Function;
import java.util.Scanner;

class Function{
    public static void prod(int a,int b){
        int product=a*b;
        System.out.println(product);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        prod(a,b);
    }
}