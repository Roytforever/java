package Demo09;

import Red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        //随机分配，有可能多有可能少
        //最少1分钱,最多不超过"剩下金额平均数的二倍"
        //第一次发红包，随机范围是0.01~6.66
        //第一次发完后，剩下的至少是3.34.
        //此时还需要再发两个红包，范围是0.01~3.34(取不到右边，剩下0.01)

        //总结：范围公式：1+random.nextInt(leftMoney / leftCount * 2)
        Random r = new Random(); // 首先创建一个随机数生成器
        //totalMoney是总金额，totalCount是总份数，不变
        //额外定义两个变量，分别表示剩下多少钱，剩下多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        //随机发钱n-1个，最后一个不需要随机
        for (int  i = 0 ;i < totalCount - 1; i++){
            //按照公式生成随机金额
            int money = r.nextInt(leftMoney /leftCount * 2) + 1;
            list.add(money);    //将一个随机红包放入集合
            leftMoney -= money; //剩下的金额越发越少
            leftCount--;        //剩下还应该再发的红包个数递减
        }

        //最后一个不需要随机，直接放进去
        list.add(leftMoney);
        return list;
    }
}
