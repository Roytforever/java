package DemoList;

import javax.swing.*;
import java.util.LinkedList;

/*
 java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //show1();
        //show2();
        show3();
    }

    /*
        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于 removeFirst
     */
    private static void show3() {
        //创建LinkedList集合对象
        LinkedList<Object> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        //Object first= linked.removeFirst();
        Object first = linked.pop();
        System.out.println("移除的第一个元素:" + first);
        Object last = linked.removeLast();
        System.out.println("移除的最后一个元素:" + last);
        System.out.println(linked);

    }

    /*
        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。
     */
    private static void show2() {
        //创建LinkedList集合对象
        LinkedList<Object> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");

        //linked.clear();//清空集合中的元素 在获取集合中的元素会抛出NoSuchElementException

        //public boolean isEmpty()：如果列表不包含元素，则返回true。
        if (!linked.isEmpty()){
        Object first = linked.getFirst();
        System.out.println(first);//a
        Object last = linked.getLast();
        System.out.println(last);//d
        }
    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
     */
    private static void show1() {
        //创建LinkedList集合对象
        LinkedList<Object> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        //public void addFirst(E e):将指定元素插入此列表的开头。
        //linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);
        //public void addLast(E e):将指定元素添加到此列表的结尾。此方法等效于 add()
        linked.addLast("com");
        System.out.println(linked);

    }
}
