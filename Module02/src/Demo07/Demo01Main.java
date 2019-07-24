package Demo07;
/*
向上转型一定是安全的，没有问题的，正确的，但是有一个弊端：
一旦向上转型为父类，那么就无法调用子类原本特有的内容。
解决方案：用对象的向下转型还原。

向上转型：
格式： 父类名称 对象名 = new 子类名称();

向下转型：
格式：子类名称 对象名 = (子类名称) 父类对象
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象
        Animal animal = new Cat(); //本来创建的时候是一只猫
        animal.eat();

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.eatMouse();

        //下面是错误的向下转型
        //错误写法，编译不会报错，但是运行出现异常
        //java.lang.ClassCastException,类转换异常
        Dog dog = (Dog) animal;

    }
}
