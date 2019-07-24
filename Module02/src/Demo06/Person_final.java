package Demo06;
/*
对于成员变量，如果用final关键字修饰，那么这个变量也照样是不可变的
1.由于成员变量具有默认值，所有用了final必须手动赋值，不会再给默认值了。
2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一。
3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值.
 */
public class Person_final {
    private  final String name /* = "小明"*/;

    public Person_final(String name) {

        this.name = name;
    }
    public Person_final() {
        name = "小米";
    }

    public String getName() {
        return name;
    }

    //public void setName(String name) {
 //       this.name = name;
  //  }

}
