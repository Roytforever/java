package DemoNiuKe;

import java.util.Scanner;


public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    private static long solve(int n) {
        boolean[] in = new boolean[n+1];
        long p = 1;
        for (int i = 2; i <= n ; i++) {
            if (!in[i]){
                int count = 1;
                for (int j = i; j <=n ; j+=i) {
                    in[j] = true;
                }
                for (long j = i; j<=n;j*=i){
                    count++;
                }
                p = (p * count) % 1000000007;
            }
        }
        return p;
    }
}
