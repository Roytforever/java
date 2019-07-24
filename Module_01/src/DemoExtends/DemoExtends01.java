package DemoExtends;
/*
在继承关系中，子类就是一个父类，也就是说子类可以被当作父类看待
例如父类是员工，子类是讲师，那么讲师就是一个员工。 关系：is-a

定义父类的格式：(一个普通的类定义)
public class 父类名称{
 //..
}

定义子类格式：
public class 子类名称 extends 父类名称{
  //..
}

 */
public class DemoExtends01 {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //teacher类中虽然什么都没有写，但是会继承父类的method的方法
        teacher.method();

        //创建另一个类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
