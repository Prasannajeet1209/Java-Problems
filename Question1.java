import java.util.Scanner;

public class Question1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("The total number of lowercase vowles are : " + count);


        String str1 = "Apna College".replace("l", "");
        System.out.println(str1);
    }

}
