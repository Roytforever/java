package Demo07;
/*
创建对象的标准格式
类名称 对象名 = new 类名称()

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();
注意事项：
匿名对象只能使用唯一一次，下次再用不得不重新创建一个新对象
使用建议：如果确定有一个对象只需要使用唯一一次，就可以用匿名对象
 */
public class DemoAnonymous {
    public static void main(String[] args) {
        DemoPerson one = new DemoPerson();
        one.name = "小明";
        one.showname();

        //匿名对象
        new DemoPerson().name = "小红";
        new DemoPerson().showname(); // null值

    }
}
