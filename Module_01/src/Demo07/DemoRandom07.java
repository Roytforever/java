package Demo07;

import java.util.ArrayList;
import java.util.Random;

/*
题目：产生20个随机数字，选择其中的偶数元素，存入集合中

方法三要素
返回值类型：ArrayList小集合(元素个数不确定)
方法名称：getSmallList
参数列表:ArrayList大集合(20个数据)
 */
public class DemoRandom07 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) +1;
            bigList.add(num);
        }
        ArrayList<Integer>  smallList = getSmallList(bigList);
        System.out.println("偶数一个多少个: " + smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    //这个方法接收大集合参数，返回小集合参数
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
