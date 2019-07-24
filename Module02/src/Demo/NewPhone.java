package Demo;
//定义一个新手机，使用老手机位父类
public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();//把父类的show方法重复利用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
