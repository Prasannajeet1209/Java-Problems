package TechM;

public class Binary {
    public static void main(String[] args) {
        int a =10;
        toBinary(a);
    }

    public static void toBinary(int num){
        int temp=0;
        int count=0;
        while ( num > 0) {
             temp = num % 2;
             num = num / 2;
             System.out.print(temp);
             count++;
             
        }
        int sum=0;
        for(int i=0;i<=count;i++){
            sum+=(int)Math.pow(temp,2);
            System.out.println();
        }
        System.out.print(sum);
    }
}
