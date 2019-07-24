package Demo01Extend;
/*
super关键字用法：
1.在子类的成员变量中，访问父类的成员变量
2.在子类的成员方法中，访问父类的成员方法
3.在子类的构造方法中，访问父类的构造方法
 */

public class Zi extends Fu {
    int num = 10;

    public Zi(){
        super();
    }

    public void methodZi(){
        System.out.println(super.num); // 父类中的num
    }

    public void method(){
        super.method(); // 访问父类的method
        System.out.println("子类方法");
    }

}
