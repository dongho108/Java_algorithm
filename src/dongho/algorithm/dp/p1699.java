package dongho.algorithm.dp;

import java.util.Scanner;

public class p1699 {
    static int [] D;
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        D = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int min = 99999;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (D[i - j * j] < min) {
                    min = D[i - j * j];
                }
            }
            D[i] = min + 1;
        }

        System.out.println(D[n]);

    }
}
