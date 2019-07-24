package com.T;

/*
定义一个方法的格式；
public static void 方法名称(){
    方法体
}
注意事项：
1.方法定义的先后顺序无所谓；
2.方法定义不能产生嵌套包含关系；
3.方法定义好后不会执行，想要执行要进行方法调用；

如何调用方法
方法名称();
*/
public class Demo_Method {
    public static void main(String[] args) {
        famer();//调用方法
        cook();
    }

    public static void famer(){
        System.out.println("12");
        System.out.println("34");
        System.out.println("56");
    }
    public static void cook(){
        System.out.println("ab");
        System.out.println("cd");
        System.out.println("ef");
    }
}
