package dongho.algorithm.dp;

import java.util.Scanner;

public class p13398 {
    static int [] D1;
    static int [] D2;
    static int [] A;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            D1 = new int[n + 1];
            D2 = new int[n + 1];
            A = new int[n + 1];



            for (int i = 1; i < n + 1; i++) {
                A[i] = sc.nextInt();
                D1[i] = D2[i] = A[i];
            }

            if(n == 1){
                System.out.println(A[n]);
                return;
            }

            for (int i = 2; i < n + 1; i++) {
                if (D1[i - 1] + A[i] > D1[i]) {
                    D1[i] = D1[i - 1] + A[i];
                }
            }

            for (int i = n-1; i > 0; i--) {
                if (D2[i + 1] + A[i] > D2[i]) {
                    D2[i] = D2[i + 1] + A[i];
                }
            }

            int result = D1[1];
            for (int i = 2; i < n + 1; i++) {
                if (result < D1[i]) {
                    result = D1[i];
                }
            }


            for (int i = 2; i < n; i++) {
                if (result < D1[i - 1] + D2[i + 1]) {
                    result = D1[i - 1] + D2[i + 1];
                }
            }




            System.out.println(Math.max(Math.max(D1[n-1], D2[2]), result));

        }
}
