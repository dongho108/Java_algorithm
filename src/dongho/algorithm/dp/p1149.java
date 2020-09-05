package dongho.algorithm.dp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Integer.min;

public class p1149 {
    static int [][] D;
    static int [][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        D = new int [n+1][3];
        A = new int [n+1][3];

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        D[1][0] = A[1][0];
        D[1][1] = A[1][1];
        D[1][2] = A[1][2];
        for (int i = 2; i < n + 1; i++) {
            D[i][0] = min(D[i - 1][1] + A[i][0], D[i - 1][2] + A[i][0]);
            D[i][1] = min(D[i - 1][0] + A[i][1], D[i - 1][2] + A[i][1]);
            D[i][2] = min(D[i - 1][0] + A[i][2], D[i - 1][1] + A[i][2]);
        }

        System.out.println(min(min(D[n][0], D[n][1]), D[n][2]));

//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(D[i][j]+" ");
//            }
//            System.out.println("");
//        }

    }



}
