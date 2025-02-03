import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class sc {
        static BufferedReader br;
        static StringTokenizer st;

        static {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        static String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        static int nextInt() {
            return Integer.parseInt(next());
        }

        static long nextLong() {
            return Long.parseLong(next());
        }

        static int[] nextIntArray(int len) {
            int[] ans = new int[len];
            for (int i = 0; i < len; ++i) {
                ans[i] = sc.nextInt();
            }
            return ans;
        }

        static long[] nextLongArray(int len) {
            long[] ans = new long[len];
            for (int i = 0; i < len; ++i) {
                ans[i] = sc.nextLong();
            }
            return ans;
        }

        static StringBuilder[] nextStringArray(int len) {
            StringBuilder[] ans = new StringBuilder[len];
            for (int i = 0; i < len; ++i) {
                ans[i] = new StringBuilder(sc.next());
            }
            return ans;
        }
    }

    public static final int MOD = 1000_000_007;
    public static final int OMOD = 998_244_353;

    public static void main(String[] args) throws Exception {
        int tc = 1;
        tc = sc.nextInt();
        for (int i = 1; i <= tc; ++i) {
            solve();
        }

    }

    public static void solve() throws Exception {
        
    }
}