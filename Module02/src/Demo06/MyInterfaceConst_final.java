package Demo06;
/*
接口当中可以定义“成员变量”，但是必须使用public static final 三个关键字修饰
从效果来看就是接口的常量
格式：
public static final 数据类型 常量名称 = 数据值；
注意：
一旦使用final关键字修饰，说明不可改变。
1.接口当中的常量，可以省略public static final ，注意：不写也照样是这样。
2.接口当中的常量，必须进行赋值，不能不赋值
3.接口当中常量的名称，使用完全大写的字母，哟个下划线进行分隔
 */
public class MyInterfaceConst_final {

    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM = 12;
}
