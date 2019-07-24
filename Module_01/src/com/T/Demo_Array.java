package com.T;
/*
数组初始化:
1.动态初始化(指定长度)
2.静态初始化(指定内容)

动态初始化数组的格式
数据类型[] 数据名称 = new 数据类型 [数组长度]
new ：创建数组的动作
省略格式
数据类型[] 数组名称 = {元素1，元素2......}
静态初始化可以拆分为两个步骤
动态初始化可以拆分为两个步骤
静态初始化省略格式不能拆分为两步骤

使用建议：
如果不确定数组中的具体内容用动态，确定数组内容用静态

访问数组元素的格式:数组名称[索引值]
 */
public class Demo_Array {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1,2,3,4};
        System.out.println(arrayA); //直接打印数组名称，得到的是数组对应的：内存地址哈希值


        String[] arrayB = new String[]{"asd","dfg","hhk"};
        int[] arrayD = new int[3];

        int [] arrayC;
        arrayC = new int[]{11,33,44};

        System.out.println(arrayC[2]);
        System.out.println(arrayB[1]);
        System.out.println(arrayD[0]);

    }
}
