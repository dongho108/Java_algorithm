package dongho.algorithm.dp;

import java.util.Scanner;

public class p15988 {
    static long [] D = new long[1000001];
    static final long mod = 1000000009;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        D[0] = 1;
        D[1] = 1;
        D[2] = 2;
        for (int i = 3; i < 1000001; i++) {
            D[i] = (D[i - 3] + D[i - 2] + D[i - 1])%mod;
        }
        while (0 < testcase--) {
            int n = sc.nextInt();
            System.out.println(D[n] % mod);

        }

    }
}
