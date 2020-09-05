package dongho.algorithm.dp;

import java.util.Scanner;

public class p1309 {
    static int [][] D;
    static final int mod = 9901;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            D = new int [n+1][3];

            D[1][0] = 1;
            D[1][1] = 1;
            D[1][2] = 1;

            for (int i = 2; i < n + 1; i++) {
                D[i][0] = (D[i - 1][0] + D[i - 1][1] + D[i - 1][2]) % mod;
                D[i][1] = (D[i - 1][0] + D[i - 1][2]) % mod;
                D[i][2] = (D[i - 1][0] + D[i - 1][1]) % mod;
            }

            System.out.println((D[n][0] + D[n][1] + D[n][2]) % mod);
        }
}
