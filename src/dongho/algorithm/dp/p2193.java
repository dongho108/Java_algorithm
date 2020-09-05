package dongho.algorithm.dp;

import java.util.Scanner;

public class p2193 {
    static long [][] D = new long[91][2];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        D[1][0] = 0;
        D[1][1] = 1;

        int n = sc.nextInt();
        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) D[i][j] = D[i - 1][0] + D[i - 1][1];
                if (j == 1) D[i][j] = D[i - 1][0];
            }
        }

        System.out.println(D[n][0] + D[n][1]);

    }
}
