package Demo08;
/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

Math.ceil方法，向上取整
强制转换int，自动舍弃所有小数位
Math.abs取绝对值

备注:如果使用Math.ceil方法，-10.8可以变为-10.0.注意double也是可以进行++的
 */
public class DemoMathodPractise01 {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min; i < max; i++){
            int abs = Math.abs(i);
            if (abs > 6 || abs <2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
