package Demo06;
/*
final关键字代表最终、不可改变的。
常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量
 */
public class Demo01Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);

        num = 20;
        System.out.println(num);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //一次赋值，终身不变
        final int num2 = 100;
        System.out.println(num2);

       // num2 = 240; //错误写法！不能改变
        // num2 = 100; //错误写法！

        //正确写法！只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        //对于基本类型来说，不可变说的就是变量当中的数据不可以改变
        //对于引用类型来说，不可变说的是变量当中的地址值不可以改变
        Student stu1 = new Student("小明");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("小方");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("=====================");

        final Student stu2 = new Student("小红");
        //错误写法！final的引用类型变量，其中的地址不可改变
        //stu2 = new Student("小米")；
        System.out.println(stu2.getName());
        stu2.setName("小米米");
        System.out.println(stu2.getName());
    }
}
