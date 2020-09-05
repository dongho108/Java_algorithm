package dongho.algorithm.dp;

import java.util.Scanner;

public class p2225 {
    static long [][] D;
    static final long mod = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        D = new long[k + 1][n + 1];

        D[0][0] = 1;
        for (int i = 1; i < k + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                for (int z = 0; z <= j; z++) {
                    D[i][j] += (D[i - 1][j - z] % mod);
                }
            }
        }

//        for (int i = 0; i < k + 1; i++) {
//            for (int j = 0; j < n + 1; j++) {
//                System.out.print(D[i][j]+" ");
//            }
//            System.out.println("");
//        }

        System.out.println(D[k][n]%mod);
    }
}
