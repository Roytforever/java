package Demo06;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //准备鼠标
        // Mouse mouse = new Mouse();
        //向上转型
        USB usb = new Mouse();
        //参数是usb类型，
        computer.useDevice(usb);

        //创建一个usb键盘
        Keyboard keyboard = new Keyboard(); // 没有使用多态写法
        //方法参数是usb类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//正确写法,发生向上转型

        //computer.useDevice(new Keyboard()); // 正确写法

        computer.powerOff();

        method(10.0);//正确写法，double -->double
        method(20); //正确写法 int -->double
        int a = 30;
        method(a);      //正确写法,int-->double

    }
    public static void method(double num){
        System.out.println(num);
    }
}
