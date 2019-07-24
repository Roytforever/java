package DemoInterface01;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法

如何定义一个接口格式：
public interface 接口名称{
        //接口内容
}

备注：换成了关键字interface之后，编译生成的字节码文件任然是：java-->.class

如果是java7，那么接口中可以包含的内容有：
1.常量
2.抽象方法

java8，还可以额外包含：
1.默认方法
2.静态方法

java9，还可以额外包含有:
1.私有方法

接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口
格式：
public class 实现类名称 implements 接口名称{
    //....
}

2.接口实现类必须覆盖重写(实现)接口中的所有抽象方法。
3.创建实现类对象，进行使用

注意事项：
如果实现类并没有覆盖重写接口中的所有抽象方法，那么这个实现类自己就必须是抽象类。
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用。
        //MyInterfaceAbstract inter = new MyInterfaceAbstract();

        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
