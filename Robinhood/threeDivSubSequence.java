package meghana;

public class q2 {

    public static void main(String[] args) {

        System.out.println(threeDivSubsequences("303"));
    }

    static int func(int i, int m, char s[], int memoize[][]) {

        if (i == s.length) return 0;

        if (memoize[i][m] != -1) return memoize[i][m];

        int x = s[i] - '0';
        int ans = ((x + m) % 3 == 0) ? 1 + func(i + 1,
                (m + x) % 3, s, memoize) : func(i + 1, (m + x) % 3, s, memoize);
        memoize[i][m] = ans;
        return memoize[i][m];
    }

    static int threeDivSubsequences(String number) {
        char[] s = number.toCharArray();
        int n = s.length;

        int[][] memoize = new int[n + 1][3];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 3; j++) {
                memoize[i][j] = -1;
            }
        }

        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0') ans++;
            else ans += func(i, 0, s, memoize);
        }

        return ans;
    }
}