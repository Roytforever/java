package SendRedPacket;

import java.util.ArrayList;

//群主类
public class Manger extends User {
    public Manger(){ }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){
        //首先需要一个集合，用来存放若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看自己还有多少钱
        int leftMoney = super.getMoney(); // 群主余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList; // 返回空集
        }
        //扣钱
        super.setMoney(leftMoney - totalMoney);

        //发红包需要拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，甩下的零头
        //剩下的零头，包在最后一个红包中
        //把红包放入集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }


}
