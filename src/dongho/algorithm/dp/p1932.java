package dongho.algorithm.dp;

import java.util.Scanner;

public class p1932 {
    static int[][] D;
    static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        D = new int[n + 1][n + 1];
        A = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        D[1][1] = A[1][1];
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                int temp=0;
                for (int k = 1; k <= i; k++) {
                    if (j == 1)
                        temp = D[i - 1][1] + A[i][j];
                    else if (j == i)
                        temp = D[i - 1][i - 1] + A[i][j];
                    else
                        temp = Math.max(D[i - 1][j - 1], D[i - 1][j]) + A[i][j];
                }
                D[i][j] = temp;
            }
        }
        int result=0;
        for (int i = 1; i < n + 1; i++) {
            if (result < D[n][i]) {
                result = D[n][i];
            }
        }

        System.out.println(result);
    }
}
