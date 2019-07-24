package Demo08;

import java.util.ArrayList;

public class DemoArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sss");
        list.add("bbb");
        list.add("ccc");
        list.add("qqq");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
