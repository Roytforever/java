package com.T;
/*
使用数组作为返回值返回具有多个返回值结果


 */
public class DemoArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,60);
        System.out.println("总和："+ result[0]);
        System.out.println("平均数: "+ result[1]);
    }
    public static int[] calculate(int a,int b, int c){
        int sum = a + b +c;
        int avg = sum / 3;
        int[] array = new int[2];
        array[0] = sum;
        array[1] = avg;
        return array;
    }
}
