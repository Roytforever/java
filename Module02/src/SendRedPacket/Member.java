package SendRedPacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    //构造方法
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个红包
        //随机获取一个集合中的索引编号

        int index = new Random().nextInt(list.size());
        //根据索引，删除集合中的这个元素，并且得到这个红包
         int delta = list.remove(index);
         //当前成员自己本来的钱
        int money = super.getMoney();
        super.setMoney(money + delta);
    }




}
