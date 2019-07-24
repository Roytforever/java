package Demo08;

import java.util.ArrayList;

/*
数组长度不可以改变
ArrayList数组长度可以改变

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：就是装在集合当中的所有元素，全部都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的括号[]
 */
public class DemoArrayList {
    public static void main(String[] args) {

        //创建了一个ArrayList集合，集合的名称是list，里面装的全是String字符串类型数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合里面添加数据，需要add方法
        list.add("aaa");
        System.out.println(list);;

        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
    }
}
