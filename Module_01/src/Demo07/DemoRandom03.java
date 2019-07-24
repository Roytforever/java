package Demo07;

import java.util.Random;
import java.util.Scanner;

/*
随机数范围[1,n]
 */
public class DemoRandom03 {
    /*
    public static void main(String[] args) {
        int n = 5;

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1; //取值范围[1,n]
            System.out.println(result);
        }

    }
    */
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.println("输入猜测的数字: ");
            int guessNum = sc.nextInt();

            if (guessNum > randomNum)
                System.out.println("猜测数字太大！");
            else
            if (guessNum < randomNum)
                System.out.println("猜测数字太小！");
           else
            {
                System.out.println("猜对了！");
                break;
            }
        }
    }

}
