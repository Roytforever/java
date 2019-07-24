package com.T;
/*
1.多个case后面的数值不可以重复；
2.switch后面小括号里只能是以下数据类型
基本数据类型：byte/short/char/int
引用数据类型：String字符串/enum枚举
3.switch语句格式可以很灵活：前后可以颠倒，而且break可以省略
 */
public class Demo_Switch {
    public static void main(String[] args) {
        int num = 4;
        switch (num){
            case 1:
                System.out.println("qq");break;
            case 2:
                System.out.println("weixin");break;
            case 4:
                System.out.println("qqlive");
            default:
                System.out.println("youku");break;
        }
    }
}
