public class SubString {

    public static String substring(String str, int si, int ei) {
        String sub = "";
        for (int i = si; i < ei; i++) {
            sub += str.charAt(i);
        }

        return sub;
    }

    public static void main(String[] args) {
        String str = "JainPrasannajeetDevendra";
        System.out.println(str.substring(2,8));
      //  System.out.println(substring(str, 4, 14));
    }
}
