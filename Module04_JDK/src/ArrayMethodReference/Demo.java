package ArrayMethodReference;
/*
    数组的构造器引用
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
        /*
        定义一个方法
        方法的参数传递创建数组的长度和ArrayBuilder接口
        方法内部根据传递的长度使用ArrayBuilder中的方法创建数组并返回
     */
        public static int[] createArray(int length,ArrayBuilder ab){
            return ab.builderArray(length);
        }

    public static void main(String[] args) {
        //调用createArray方法,传递数组的长度和Lambda表达式
        int[] array = createArray(10, (len) -> {
            //根据数组的长度,创建数组并返回
            return new int[len];
        });
        System.out.println(array.length);

                /*
            使用方法引用优化Lambda表达式
            已知创建的就是int[]数组
            数组的长度也是已知的
            就可以使用方法引用
            int[]引用new,根据参数传递的长度来创建数组
         */
        int[] array1 = createArray(10, int[]::new);
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);
    }
}
