package Demo07;

import java.util.Scanner;

/*
题目：
键盘输入三个int数字，求出其中的最大值。

思路：
1.键盘输入，需要使用scanner
2.scanner三个步骤：导包、创建、使用nextInt()方法
3.***
4.***
 */
public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("输入第三个数字：");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大数是:" + max);
    }
}
