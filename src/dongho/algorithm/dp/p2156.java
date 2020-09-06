package dongho.algorithm.dp;

import java.util.Scanner;

public class p2156 {
    static long [] D;
    static int [] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        D = new long[n + 1];
        A = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = sc.nextInt();
        }

        D[1] = A[1];
        if(n>1)
            D[2] = A[1]+A[2];


        for (int i = 3; i < n + 1; i++) {
            D[i] = Math.max(Math.max(D[i - 1], D[i - 2] + A[i]),
                    D[i - 3] + A[i - 1] + A[i]);
        }
        System.out.println(D[n]);
    }
}
