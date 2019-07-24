package DemoStatic;

/*
public static double abs( double num) :获取绝对值
public static double ceil（double num）：向上取整
public static double floor（double num）：向下取整
public static long round（double num）：四舍五入

Math.PI
 */
public class DemoMath01 {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println(Math.ceil(3.1));//3.0

        //向下取整（抹零）
        System.out.println(Math.floor(3.5)); //3
        System.out.println("+++++++++++++++++++++++++");

        //四舍五入
        System.out.println(Math.round(3.676)); // 不带小数点
        System.out.println(Math.round(Math.PI));
    }
}
