package dongho.algorithm.dp;

import java.util.Scanner;

public class p10844 {
    static long [][] D = new long [101][10];
    static long mod = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<10; i++){
            D[1][i] = 1;
        }


        int n;
        n = sc.nextInt();
        for(int i=2; i<=n; i++){
            for(int j=0; j<10; j++){
                if(j-1 >= 0) D[i][j] += D[i-1][j-1];
                if(j+1 <= 9) D[i][j] += D[i-1][j+1];
                D[i][j] %= mod;
            }
        }

        long result=0;

        for(int i=0; i<10; i++){
            result += D[n][i];
        }
        System.out.println(result % mod);

    }
}
