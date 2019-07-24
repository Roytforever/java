package Demo08;

import java.util.ArrayList;

/*
ArrayList当中常用的方法有

public boolean add(E e)：向集合中添加元素，参数的类型和泛型一致
public E get (int index):从集合中获取元素，参数是索引号，返回值就是对应位置的元素
public E remove (int index):从集合中删除元素，参数是索引号，返回值就是被删除元素
public int size():或者集合的尺寸长度，返回值是集合中包含的元素个数

 */
public class DemoArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        boolean success = list.add("aaa");
        System.out.println(list);
        System.out.println("添加动作是否成功：" + success); //true

        list.add("aaab");
        list.add("bbbb");
        System.out.println(list);

        //从集合中获取元素，get 索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引值: " + name);

        //从集合中删除元素，remove
        String whoremove = list.remove(2);
        System.out.println("被删除的人是： " + whoremove);
        System.out.println(list);

        //获取的集合长度
        int size = list.size();
        System.out.println("集合长度是：" + size);
    }
}
