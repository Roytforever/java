package DemoExtends;
/*
1.java语言是单继承的
一个类的直接父类只能有唯一一个

class A{}
class B extends A{}//正确
class C{}
class Dextends A,C{}//错误

2.java可以多级继承
我有一个父亲，父亲也有一个父亲，也就是爷爷
class A{}
class B extends A{}//正确
class C extends B{}//正确

3.一个子类的直接父类是唯一的，但是一个直接父类可以拥有很多个子类
可以有很多个兄弟姐妹
class A {}
class B extends A{} //正确
class C extends A{}//正确

 */
public class Zi extends Fu {
    int num = 20;

    @Override // 建议添加
    public void method(){
        super.method();//调用父类方法
        System.out.println("子类方法！");
    }

    public void show(){
        int num = 30;
        System.out.println(num); //30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }


}
