package Demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        //根据phone类创建一个名为phone对象
        //格式：类名称 对象名 = new 类名称();
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        phone.brand = "apple";
        phone.price = 7653.99;
        phone.color = "白色";

        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);


        //成员方法 保存的是地址值
        phone.call("雷军");
        phone.sendMessage();

        //将phone中的值传递给phonetwo
        Phone phonetwo = phone;
        System.out.println(phonetwo.brand);
        System.out.println(phonetwo.price);
        System.out.println(phonetwo.color);

        phonetwo.brand = "apple";
        phonetwo.price = 7653.99;
        phonetwo.color = "白色";

        System.out.println(phonetwo.brand);
        System.out.println(phonetwo.price);
        System.out.println(phonetwo.color);


        //成员方法 保存的是地址值
        phonetwo.call("雷军");
        phonetwo.sendMessage();



    }
}
