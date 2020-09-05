package dongho.algorithm.dp;

import java.util.Scanner;


public class p9465 {
    static int [][] D;
    static int [][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (0 < testcase--) {
            int n = sc.nextInt();
            D = new int [n+1][3];
            A = new int [3][n+1];

            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < n+1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }



            D[1][0] = 0;
            D[1][1] = A[1][1];
            D[1][2] = A[2][1];
            for (int i = 2; i < n + 1; i++) {
                D[i][0] = Math.max((Math.max(D[i - 1][0], D[i - 1][1])), D[i - 1][2]);
                D[i][1] = Math.max(D[i - 1][0], D[i - 1][2])+A[1][i];
                D[i][2] = Math.max(D[i - 1][0], D[i - 1][1])+A[2][i];
            }



            System.out.println(Math.max((Math.max(D[n][0], D[n][1])), D[n][2]));


        }





    }
}
