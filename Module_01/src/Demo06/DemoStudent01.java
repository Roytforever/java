package Demo06;
/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1.导包：需要指出使用的类在上面位置
import 包名称.类名称
import Demo06.Student；
对于和当前类属于同一个包的情况，可以省略导包语不写

2.创建，格式：
类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用 分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法： 对象名.成员方法名(参数)
(也就是想用谁就对象名点谁)
 */
public class DemoStudent01 {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);

        //改变对象当中的成员变量数值内容
        stu.name = "aaa";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //使用对象的成员方法，格式
        stu.eat();
        stu.sleep();
        stu.study();



    }
}
