package Demo06;
/*
自定义的类也可以作为return返回值
 */
public class DemoPhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8888;
        one.color = "白色";
        return one;
    }
}
