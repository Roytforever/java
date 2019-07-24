package DemoInterface01;
/*
从java8开始，接口允许定义默认方法
格式：
public default 返回值类型 方法名称(){
        //方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();

    //抽象方法
   // public abstract void methodAbs2();

    //新添加的默认方法，
    public default void methodDefault(){
        System.out.println("这是一个新添加的默认方法");
    }
}
