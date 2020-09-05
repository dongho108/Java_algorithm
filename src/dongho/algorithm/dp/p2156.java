package dongho.algorithm.dp;

import java.util.Scanner;

public class p2156 {
    static int [] D;
    static int [] A;

    public static void maih(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        D = new int[n + 1];
        A = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = sc.nextInt();
        }

        D[1] = A[1];
        D[2] = Math.max(D[1], A[2]);
        D[3] = Math.max(Math.max(D[2], D[1] + A[3]), A[2] + A[3]);

        for (int i = 4; i < n + 1; i++) {
            Math.max(Math.max(D[i - 1], D[i - 2] + A[n]), D[i - 3] + D[i - 1] + A[n]);
        }

        System.out.println(D[n]);


    }
}
