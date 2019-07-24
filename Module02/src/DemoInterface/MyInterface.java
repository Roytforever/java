package DemoInterface;
/*
这个子接口有几个方法？ 4个
methodA 来自接口A
methodB
methodCommon
method
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
