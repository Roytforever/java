package Demo07;

import java.util.ArrayList;

/*
定义指定格式打印集合的方法

 */
public class DemoRandom06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xx");
        list.add("aa");
        list.add("bb");
        list.add("cc");
        System.out.println(list);

        printArrayList(list);
    }

    /*
    定义方法三要素
    返回值类型
    方法名称
    参数列表
     */

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size()-1){
                System.out.println(name + "}");
            }
            else System.out.print(name + "@");

        }
    }
}
