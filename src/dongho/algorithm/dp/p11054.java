package dongho.algorithm.dp;

import java.util.Scanner;

public class p11054 {
    static int [] d1;
    static int [] d2;
    static int [] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        d1 = new int[n + 1];
        d2 = new int[n + 1];
        a = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            a[i] = sc.nextInt();
            d1[i] = d2[i] = 1;
        }

        // i번째에서 끝나는 증가하는 가장 긴 부분수열
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (a[j] < a[i] && d1[i] < d1[j] + 1) {
                    d1[i] = d1[j] + 1;
                }
            }
        }

        // i번째에서 시작하는 감소하는 가장 긴 부분수열
        for (int i = n-1; i > 0; i--) {
            for (int j = n; j > i; j--) {
                if (a[j] < a[i] && d2[i] < d2[j] + 1) {
                    d2[i] = d2[j] + 1;
                }
            }
        }


        //k번째가 최고점일때 가장 긴 바이토닉 부분수열
        int result = 0;
        for (int k = 1; k < n + 1; k++) {
            if (result < d1[k] + d2[k] - 1) {
                result = d1[k] + d2[k] - 1;
            }
        }

        System.out.println(result);

    }
}
