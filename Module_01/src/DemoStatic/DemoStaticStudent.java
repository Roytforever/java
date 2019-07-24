package DemoStatic;
/*
根据类名称访问静态成员变量的时候，全程和对象就没有关系，只和类有关系。
 */
public class DemoStaticStudent {
    public static void main(String[] args) {
        //首先设置教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";
        Student one = new Student("小明",23);
        System.out.println("one的名字：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        System.out.println("+++++++++++++++++++++++");

        Student two = new Student("小方",22);
        System.out.println("two的名字：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
    }
}
