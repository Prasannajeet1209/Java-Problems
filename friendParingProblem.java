public class friendParingProblem {

    public static int Friendparing(int n) {
        if (n == 1 || n == 2) {
            return n;

        }
        return Friendparing(n - 1) + (n - 1) * Friendparing(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Friendparing(n));
    }
}
 