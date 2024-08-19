import java.util.Scanner;

public class Matrix {


    public static void search(int matrix[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               
                min=Math.min(matrix[i][j],min);
                max=Math.max(matrix[i][j],max);
                
            }
            
           

        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]=new int[3][3];
        System.out.println("Enter the Matrix Element : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        search(matrix);
    }
    
}
