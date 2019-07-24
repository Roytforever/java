package DemoStatic;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法。
静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。
如果有static关键字，那么不需要创建对象，直接通过类名称使用它。

静态变量：类名称.静态变量
静态方法：类名称.静态方法()

注意事项：
1.静态不能直接访问非静态
原因：因为内存中先有的静态内容，后有的非静态内容
“先人不知道后人，但是后人知道先人”
2.静态方法中不能使用this
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。

 */
public class DemoStaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法的，可以通过对象名进行调用，也可以直接通过类名称调用
        //obj.methodStatic(); // 正确，不推荐
        MyClass.methodStatic();//正确，推荐  类名称.静态方法名

        //对于本类中的静态方法，可以省略类名称
        myMethod();
        //DemoStaticMethod.myMethod();//完全等效

    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}
