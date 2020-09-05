package dongho.algorithm.dp;

import java.util.Scanner;

public class p11053 {
    static int [] A;
    static int [] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        A = new int[n+1];
        D = new int[n+1];

        for(int i=1; i<n+1; i++){
            A[i] = sc.nextInt();
        }

        int temp = 0;
        int k=0;
        for (int i = 1; i < n + 1; i++) {
            D[i] = 1;
        }
        for(int i=2; i<n+1; i++){
            for (int j = 1; j < i; j++) {
                if(A[j] < A[i]){
                    if (D[j] > temp) {
                        temp = D[j];
                        k = j;
                    }
                }
            }
            D[i] = D[k]+1;
            k=0;
            temp=0;

        }
//        for(int j=1; j<n+1; j++){
//            System.out.print(D[j]+" ");
//        }
//        System.out.println("");

        int result=0;
        for (int i = 1; i < n + 1; i++) {
            if (D[i] > result) {
                result = D[i];
            }
        }
        System.out.println(result);

    }
}
