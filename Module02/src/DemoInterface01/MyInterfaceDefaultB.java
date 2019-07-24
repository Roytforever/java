package DemoInterface01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现抽象方法BBB");
    }

    @Override
    public void methodDefault(){
        System.out.println("实现类覆盖重写了接口的默认方法");
    }
}
