package com.T;
/*
方法重载(Overload)：多个方法的名称相同，参数列表不一样。
方法重载与下列因素有关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关
1.与参数名称无关
2.与方法的返回值类型无关
 */
public class DemoMethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, double b){
        return (int)(a + b);
    }

    public static int sum(int a, int b, int c){
        return  a + b + c;
    }
}
