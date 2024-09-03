import java.util.*;

public class Question2 {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            if (Arrays.equals(str1charArray, str2charArray)) {
                System.out.println("Yes,String is Anagram");
            } else {
                System.out.println("No,String is not Anagram");
            }
        } else {
            System.out.println("No");
        }
    }

}
