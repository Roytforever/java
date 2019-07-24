package DemoExtends;
/*
在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有向上找原则
间接通过成员方法访问成员变量：
    方法属于谁就优先用谁，没有则向上找
 */
public class DemoExtendsField {
    public static void main(String[] args) {
        Zi zi =new Zi();
        zi.show();
        zi.method();
        Fu fu = new Fu();

        //等号左边是谁，优先用谁
        System.out.println(fu.num);
        System.out.println(zi.num);//优先子类
    }
}
