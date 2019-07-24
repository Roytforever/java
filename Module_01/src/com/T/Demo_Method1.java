package com.T;
/*
方法其实就是若干语句的集合。
方法：参数：进入方法的数据
      返回值：从方法中出来的数据

定义方法的完整格式：
修饰符 返回值类型 方法名称(参数类型 参数名称，...){
        方法体
        return 返回值；
}

return 后面返回值必须和方法前面返回值类型对应

三种方法调用格式：
1.单独调用
2.打印调用
3.赋值调用
*
void返回值类型只能单独调用不能进行打印调用或者赋值调用

有参数方法：
无参数：
 */
public class Demo_Method1 {
    public static void main(String[] args) {
        //单独调用
      sum(5,6);
        System.out.println("========");
        //打印调用
        System.out.println(sum(5,6));
        System.out.println("=========");
        //赋值调用
        int number = sum(5,6);
        System.out.println(number);
        System.out.println("==========");
    }
    public static int sum(int a, int b){
        int result = a + b;
        System.out.println("方法调用了！");
        return result;
    }
}
