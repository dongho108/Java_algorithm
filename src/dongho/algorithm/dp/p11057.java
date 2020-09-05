package dongho.algorithm.dp;

import java.util.Scanner;

public class p11057 {
    static int [][] D;
    static final int mod = 10007;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            D = new int [n+1][10];

            for (int i = 0; i < 10; i++) {
                D[1][i] = 1;
            }

            for (int i = 2; i < n + 1; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k <= j; k++) {
                        D[i][j] += D[i-1][k];
                        D[i][j] %= mod;
                    }
                }
            }
            int result = 0;
            for (int i = 0; i < 10; i++) {
                result += D[n][i];
            }
            System.out.println(result % mod);
        }
}
