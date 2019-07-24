package Demo06;

public class DemoPhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 9999;
        one.color = "白色";

        method(one); // 传递进去的参数其实是地址

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
