package Demo04;
/*
当方法的局部变量和类的成员变量重名的时候，根据"就近原则"，优先使用局部变量；
如果需要访问本类中的成员变量，需要使用格式：this.成员变量名

”通过谁调用的方法，谁就是this“
 */

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "aaa";
        person.sayHello("www");
    }

}
