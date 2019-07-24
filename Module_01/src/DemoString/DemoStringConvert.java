package DemoString;

/*
String中与转换相关的常用方法有：

public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes():获取当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString):将所有出现的老字符串转换为新的字符串，返回替换后的字符串
 */
public class DemoStringConvert {

    public static void main(String[] args) {
        //转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("+++++++++++++++++++++++++");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("+++++++++++++++++++++++++");

        //字符串内容替换
        String str1= "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "你小子会不会！";
        String lang2 = lang1.replace("会不会","***");
        System.out.println(lang2);
    }
}
