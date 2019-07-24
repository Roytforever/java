package DemoNiuKe;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String str = sc.nextLine();
        for ( int i = str.length() - 1; i > 0;i--) {
            if (str.substring( 0, i/2).equals(str.substring(  i/2,i ))){
                System.out.println(i);

            }
        }
    }
}
