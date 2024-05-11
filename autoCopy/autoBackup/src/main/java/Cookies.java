import java.util.Arrays;

public class Cookies {
    public static int cookies(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int j : g) {
            for (int k : s) {
                if (j <= k) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
        int[] b = {1, 2, 3};
        System.out.println(cookies(a, b));
    }
}
