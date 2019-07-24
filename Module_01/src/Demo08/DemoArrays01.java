package Demo08;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。
public static String toString(数组)：将参数数组变成字符串(按照默认格式：[元素1，元素2....])

注意事项：
1.如果是数组，sort默认按照升序从小到大
2.如果是字符串，sort默认按照字母升序
3.如果是自定义类型，那么这个自定义的类需要有comparable 或者Comparator接口的支持。(*)
 */
public class DemoArrays01 {
    public static void main(String[] args) {
        int[] intArray = {10,20,33};
        //将int数组转换为字符串
        String inStr = Arrays.toString(intArray);
        System.out.println(inStr); //

        int[] array1 = {2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","bbb","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
