package Demo07;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
生成6个1到33的随机整数，添加到集合中，遍历集合

思路：
1.需要存储6个数字，创建一个集合 <Integer>
2.产生随机数，Random
3.循环6次
4.循环内调用r.nextInt(int n)
5.添加
6.遍历集合
 */
public class DemoRandom04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
