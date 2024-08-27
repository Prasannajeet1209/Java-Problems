import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name ;
        name = sc.nextLine();
        String surname = sc.nextLine();
        surname= name+" "+surname;
        System.out.println(surname.charAt(1));
    }
    
}
