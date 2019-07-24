package Demo04;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println("===============");
        Student stu2 = new Student("aaa",20);
        System.out.println("姓名: " + stu2.getName() + "年龄：" + stu2.getAge());
        stu2.setAge(21);
        System.out.println("姓名: " + stu2.getName() + "年龄：" + stu2.getAge());

    }
}
