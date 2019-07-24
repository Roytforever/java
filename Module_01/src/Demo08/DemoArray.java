package Demo08;
/*
题目：定义一个数组，用来存储三个person对象
 数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变。

 */
public class DemoArray {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面存放Person类型对象
        Person[] array = new Person[3];

        Person one = new Person("小明",22);
        Person two = new Person("小方",24);
        Person three = new Person("小红",26);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());

        System.out.println(array[0].getName() + array[0].getAge());
    }
}
