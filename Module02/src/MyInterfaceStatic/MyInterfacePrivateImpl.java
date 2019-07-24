package MyInterfaceStatic;

public class MyInterfacePrivateImpl implements MyInterfacePrivateA {

    public void methodAnother(){
        //直接访问到接口当中的默认方法,这样是错误的！
        //methodCommon();
    }
}
