package DemoNiuKe;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(result(s));
    }

    private static int result(String s) {
        for (int i = s.length() -1;i>0;i--){
            if (isString(s.substring(0,i))){
                return i;
            }
        }
        return 1;
    }
    private static boolean isString(String s){
        String front = s.substring(0,s.length()/2);

        String end = s.substring(s.length()/2,s.length());

        return front.equals(end);
    }

}
