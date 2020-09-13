package dongho.algorithm.dp;

import java.util.Scanner;

public class pp1309 {
    static int [] d;
    static int [] s;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            d = new int[n + 1];
            s = new int[n + 1];

            d[0] = s[0] = 1;
            d[1] = 2;
//             아무것도 놓지 않을때는 왜 정답이 되지?
//             -> s[i]를 정답으로 쓸건데,
//             ex) s[10]에는 d[1]도 포함되어있는데, 이건 i가 2인것부터 아무것도 놓지 않음을 나타냄.
//              그래서 가능한것
            s[1] = d[0] + d[1];

            for (int i = 2; i < n + 1; i++) {
                d[i] = d[i - 1] + 2 * s[i - 2];
                s[i] = s[i - 1] + d[i];
                d[i] = d[i] % 9901;
                s[i] = s[i] % 9901;
            }

            System.out.println(s[n]);



        }
}
