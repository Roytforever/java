package SendRedPacket;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger("群主",100);
        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=====================");

        //群主总共发20 ，三个红包
        ArrayList<Integer> redList = manger.send(20,3);
        //收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manger.show(); // 80
        //6 6 8 随机分配
        one.show();
        two.show();
        three.show();

    }
}
