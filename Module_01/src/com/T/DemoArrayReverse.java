package com.T;
/*
元素反转
 */
public class DemoArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.println("==============");

        for (int min = 0, max = array.length-1; min < max; min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

}
