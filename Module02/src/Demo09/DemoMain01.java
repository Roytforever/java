package Demo09;
/*
如果接口的实现类(或者父类的子类)只需要使用唯一的一次，
那么这种情况下可以省略该类的定义，而改为使用匿名内部类。

匿名内部类格式：
接口名称 对象名 = new 接口名称(){
        //覆盖重写所有抽象方法
}；

对格式“new” 接口名称(){....}进行解析
1.new代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{...}这才是匿名内部类的内容

另外还需要注意：
1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类
2.匿名对象，在调用方法的时候，只能调用唯一一次。
如果希望同一个对象，调用多次方法，那么必须给对象起一个名字。
3.匿名内部类是省略了实现类/子类，但是匿名对象是省略了对象名称
强调：匿名内部类和匿名对象不是同一回事！！！
注意事项：
 */
public class DemoMain01 {
    public static void main(String[] args) {
//        MyInterfaceImpl obj = new MyInterfaceImpl();
//        obj.method();

        //使用匿名内部类,但不是匿名对象，对象名称是some
        MyInterface some = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法！");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写222");
            }
        };
        some.method();
        some.method2();

        //使用了匿名内部类，而且省略了对象名称，也就是匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法！");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写222");
            }
        }.method();
        //因为匿名对象无法调用第二次，所有需要在创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现方法！");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写222");
            }
        }.method2();


    }
}
