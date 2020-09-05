package dongho.algorithm.dp;

import java.util.Scanner;



public class p1912 {
    static int [] A;
    static int [] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        A = new int[n + 1];
        D = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = sc.nextInt();
        }

        D[1] = A[1];

        for (int i = 2; i < n + 1; i++) {
            if (D[i - 1] + A[i] < A[i]) {
                D[i] = A[i];
            }
            else{
                D[i] = D[i - 1] + A[i];
            }
        }

        int result = D[1];
        for (int i = 1; i < n + 1; i++) {
            if (result < D[i]) {
                result = D[i];
            }
        }

        System.out.println(result);
    }
}
