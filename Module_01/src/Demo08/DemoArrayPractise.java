package Demo08;
/*
题目：
使用Arrays相关API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
import java.util.Arrays;

public class DemoArrayPractise {
    public static void main(String[] args) {
        String str = "skjhkjhfhkj267dhdn";

        //如何进行升序排列：sort
        //必须是一个数组，才能使用Arrays.sort方法
        //String -->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列

        //倒序遍历输出
        for (int i = chars.length - 1; i >= 0; i--) { //chars.forr -->倒序
            System.out.println(chars[i]);
        }
    }
}
