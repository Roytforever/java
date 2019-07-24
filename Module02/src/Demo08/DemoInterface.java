package Demo08;

import java.util.ArrayList;
import java.util.List;
/*
java.util.List正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
       List<String> list = new ArrayList<>();

       List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
    }

    public static List<String> addNames (List<String> list){ //接口可以作为方法的参数和返回值
        list.add("小米");
        list.add("oppo");
        list.add("中兴");
        list.add("华为");
        return list;
    }
}
