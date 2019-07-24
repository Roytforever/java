package com.T;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        int i,j,temp,t;
        if(low > high){
            return;
        }
        i = low;
        j = high;
        /* temp是基准位 */
        temp = arr[low];
        /* 先看右边，依次往左递减 */
        while (i < j){
            while (temp<=arr[j] && i<j){
                j--;
            }
            /* 再看右边，一次往右递增 */
            while (temp>=arr[j] &&i<j){
                i++;
            }
            /* 如果满足条件，交换 */
        if(i < j){
            t=arr[j];
            arr[j]=arr[i];
            arr[i]=t;
           }
        }
        /* 最后将基准位与i和j相等的位置数字交换 */
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);

    }

    public static void main(String[] args) {
        int [] arr = {10,7,2,4,62,3,4,2,1,8,9,19};
        quickSort(arr,0,arr.length-1);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

