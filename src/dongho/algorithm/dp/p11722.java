package dongho.algorithm.dp;

import java.util.Scanner;

public class p11722 {
    static int [] d;
    static int [] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        d = new int[n + 1];
        a = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
            d[i] = 1;
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (a[j] > a[i] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }
        }

        int result=0;
        for (int i = 1; i < n + 1; i++) {
            if (result < d[i]) {
                result = d[i];
            }
        }
        System.out.println(result);
    }
}
