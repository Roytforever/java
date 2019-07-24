package DemoString;
/*
String当中与获取相关的常用方法有：

1.public int Length():获取字符串当中含有的字符个数，拿到字符串长度
2.public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串
3.public char charAt(int index)：获取指定索引值位置的单个字符。（索引从0开始）
4.public int indexOf(String str)：查找参数字符串在本字符串当中首次出现索引位置，如果没有返回-1值
 */
public class DemoStringGet {
    public static void main(String[] args) {
        //字符串长度
        int length = "snjkhjbmcdfkmlkjlks".length();
        System.out.println("字符串长度：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//原封不动
        System.out.println(str2);//原封不动
        System.out.println(str3);//新字符串
        System.out.println("++++++++++++++++++++++++");


        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是: " + ch);
        System.out.println("++++++++++++++++++++++++");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值: " + index);//2
        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
