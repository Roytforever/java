package Demo06;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每一个具体步骤都要亲力亲为，详细处理每一个细节。***强调步骤
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮忙做事。***强调对象

类：类是一类事物的描述，是抽象的
对象：对象是一类事物的实列，是具体的
类是对象的模板，对象是类的实体
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10,288,4,38,22,48,58};

        //要求打印格式为[0,288,4,38,22,48,58]
        //使用面向过程,每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i =0;i < array.length; i++){
            if (i == array.length-1){
                System.out.println(array[i] + "]");
            }else
            System.out.print(array[i] + ", ");
        }
        System.out.println("=================");

        //使用面向对象
        //找一个jdk给我们提供好的Array类
        //其中有一个toString方法，直接就能把数组变为想要的格式字符串
        System.out.println(Arrays.toString(array));
    }
}
