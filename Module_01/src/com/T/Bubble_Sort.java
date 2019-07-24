package com.T;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr={87,55,3,4,66,34,90,30,88};
        System.out.println("排序前数组：");
        for (int num:arr){
            System.out.print(num + " ");
        }

        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组: ");
        for (int num:arr){
            System.out.print(num+ " ");

        }
    }
}
