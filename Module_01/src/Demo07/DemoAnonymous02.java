package Demo07;

import java.util.Scanner;

public class DemoAnonymous02 {
    public static void main(String[] args) {

        //普通的方式
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); */

        //匿名对象de 方式
        Scanner num = new Scanner(System.in);
        methodParam(num);

        //使用一般写法传入参数
        /*methodParam(new Scanner(System.in));
        methodParam(num);*/

        //使用匿名对象进行传参
        //methodParam(new Scanner(System.in));

        Scanner sc = methdReturn();
        int num1 = sc.nextInt();
        System.out.println("输入的是: " + num1);

    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是: " + num);

    }

    public static Scanner methdReturn(){
        //Scanner sc = new Scanner(System.in);
        //return sc;

        return  new Scanner(System.in);
    }
}
