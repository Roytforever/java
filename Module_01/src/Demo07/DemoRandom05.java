package Demo07;

import java.util.ArrayList;

/*
题目：自定义学生类，添加到集合，遍历

思路：
1.自定义student学生类，四个部分
2.创建集合，用来存储学生对象。泛型：<student>
3.根据类，创建四个学生对象
4.将四个学生对象添加到集合中：add
5.遍历集合：for size get
 */
public class DemoRandom05 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("小明", 20);
        Student two = new Student("小方", 22);
        Student three = new Student("小红", 23);
        Student four = new Student("小李", 24);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名: " + stu.getName() + ", 年龄" + stu.getAge());
        }
    }
}
