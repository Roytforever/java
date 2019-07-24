package Demo07;

import java.util.Scanner;

/*
Scanner提供从键盘输入数据到程序的功能

1.导包:只有java.lang包中的内容不需要导包
2.创建
类名称 对象名 = new 类名称()
3.使用
对象名.成员方法名()
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in代表从键盘输入

        int num = sc.nextInt();
        int num2 = sc.nextInt();

       /*
        String str = sc.next();//输入字符串
        System.out.println(str);
         */

       System.out.println(num + num2);


    }
}
