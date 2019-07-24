package Demo05;
/*
一个标准的类通常要拥有下面四部分

1.所有的成员变量都要使用private关键字修饰
2.为每一个成员变量编写一对Getter/Setter方法
3.编写一个无参构造方法
4.编写一个全参的构造方法

这样的标准类 也叫做java Bean
 */
public class Student {

    private String name;//姓名
    private int age; //年龄


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { //获取
        return name;
    }

    public void setName(String name) { //设置
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
