package Demo08;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类
基本类型            包装类型(引用类型 ，包装类都位于java.lang包下)
byte                Byte
short               Short
int                 Integer     特殊
long                Iong
float               Float
double              Double
char                Character       特殊
boolean             Boolean
 */
public class DemoArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();

        listC.add(111);
        listC.add(222);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println("第1号元素是：" + num);
    }
}
