import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number : ");
        int input= sc.nextInt();
        int input1=input;
        int rem=0;
        while(input!=0){
           
            int temp= input%10;
             rem= rem+temp*temp*temp;
             input=input/10;
        }
        if(rem==input1){
            System.out.println("Number is ArmStrong");
        }else{
            System.out.println("Number is not ArmStrong");
        }
    }
    
}
