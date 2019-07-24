package DemoThis;
/*
super关键字用来访问父类内容，而this用来访问本类内容。三种用法

1.在本类的成员方法中，访问本类的成员变量。
2.在本类的成员方法中，访问本类的另一个成员方法
3.在本类构造方法中，访问本类的另一个构造方法: 注意：this(...)调用也必须是构造方法的第一个语句 ,唯一一个
                                                    super和this两种构造调用不能同时使用。
 */
public class Zi extends Fu {

    int num = 20;

    public Zi(){  //构造方法
        this(123);//本类的无参构造，调用本类的有参构造
       // this(123,456);
    }

    public Zi(int n){ //构造方法
        this(123,456);
    }

    public Zi(int m,int n){ //构造方
        // this();//错误写法
    }

    public void showNum(){
        int num = 20;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }

    public void methodA(){
        System.out.println("aaa");

    }

    public void methodB(){
        this.methodA();
        System.out.println("bbb");
    }
}
