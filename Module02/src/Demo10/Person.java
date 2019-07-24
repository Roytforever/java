package Demo10;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    直接打印对象的地址值没有意义，需要重写Object类中的toString方法
    直接打印对象的属性(name，age)
     */

    /*
    @Override
    public String toString() {
        //return "abc";
        return "Person{name="+ name +" ,age="+ age +"}";
    }*/

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
    Object类的equals方法默认比较两个对象的地址值，没有意义
    所有重写equals方法，比较两个对象的属性(name,age)
    问题：
        隐含着一个多态
        多态的弊端：无法使用子类特有的内容(属性和方法）
        解决：可以使用向下转型(强转)把Object转型为Person
     */

    /*@Override
    public boolean equals(Object obj) {
        //如果传递参数为null，直接返回flase
        if (obj == null || obj == this){
            return false;
        }

        //增加一个判断，防止类型转换出现ClassCastException异常
        if (obj instanceof Person){
            //使用向下转型，把obj转型为Person类型
            Person p = (Person)obj;
            //比较两个对象的属性，一个对象是this(p1),一个对象是p(p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术，判断o是否是Person类型  等效与 obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Person() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
