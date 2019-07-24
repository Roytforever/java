package DemoExtends;
/*
面向对象的三大特征：封装性、继承性、多态性。
继承是多态的前提，如果没有继承就没有多态。

继承主要解决的问题是：共性抽取

继承关系的特点：
1.子类可以拥有父类的“内容”
2.子类还可以拥有自己专有的内容
 */
public class Fu {
    int num = 10;
    public void method(){
        System.out.println("父类方法！");
    }
}
