package com.T;

/*
java内存需要划分为5个部分:
1.栈(Stack)：存放的都是方法中的局部变量  方法的运行一定要在栈中运行
          局部变量：方法的参数或者是方法{}内部的变量
         作用域：一旦超出作用域，立刻从栈内存中消失

2.堆（Heap）：凡是用new出来的东西，都在堆里面。
                堆内存里面的东西都有一个地址值：16进制
                堆内存里面的数据，都有默认值。规则
                如果是整数：      默认为0
                如果是浮点数      默认是0.0
                如果是字符        默认是'\u0000'
                如果是布尔       默认是false
                如果是引用类型     默认为null

3.方法区(Method Area): 存储.class相关信息，包含方法的信息。

4.本地方法栈(Native Method Stack): 与操作系统相关

5.寄存器(pc Register)： 与CPU相关

 */
public class DemoArrayUse {
    public static void main(String[] args) {

        /*
        所有引用类型变量，都可以赋值为一个null值，但是代表其中什么都没有。
        如果只是赋值一个null，没有进行new创建
        那么将会发生：
        空指针异常 NullPointerException

        原因：忘了new
        解决：补上new
         */
        int[] array = null;
        array = new int[3];
        System.out.println(array[0]);
    }
}
