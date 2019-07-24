package Demo07;

import java.util.Random;

/*
random用来生成随机数字
1.导包
2.创建
Random r = new Random();
3.使用
获取一个随机int数字(范围是int所有范围，有正负两种):int num = r.nextInt();括号留空
获取一个随机int数字(数字代表一个范围，左闭右开区间)： int num = r.nextInt(3);
实际代表含义是[0，3）
 */
public class Demo07Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是: " + num);

    }

}
