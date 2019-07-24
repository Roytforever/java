package com.T;
/*
数组遍历，说的就是对数组当中的每一个元素进行逐一处理，打印输出。
 */
public class DemoArray01 {
    public static void main(String[] args) {
        int[] array = {10,99,2763,65};//数据类型[] 数组名称 = {元素1，元素2......}

        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
