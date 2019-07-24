package DemoNiuKe;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int[] ch = new int[256];
            for (int i = 0; i <s.length() ; i++) {
                ch[s.charAt(i)]++;
            }
            int res = getNum(ch);
            System.out.println(res);
        }
    }
    private static int getNum(int[] ch) {
        int res = 0;
        int len = ch.length;
        for (int i = 0; i < 256; i++) {
            if ((ch[i] & 1) == 1){
                res ++ ;
                System.out.println(ch[i] & 1);
            }
        }
        return res == 0 ? 1:res;
    }
}
