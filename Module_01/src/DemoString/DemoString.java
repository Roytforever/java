package DemoString;
/*
程序当中所有的双引号字符串，都是String类的对象(就算没有new也照样是)

字符串特点：
1.字符串的内容永不改变。(常量)
2.因为字符串内容不可改变，所有字符串都是可以共享使用的
3.字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组


创建字符串的常见3+1种方式
三种构造方法
public String():创建一个空白字符串，不含有任何内容
public String(char[] array):根据字符数组的内容，来创建对应的字符串
public String(byte[] array):根据字节数组的内容，来创建对应的字符串
一种直接创建
String str = “Hello”  注意：直接上双引号也是字符串对象
 */
public class DemoString {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();//小括号留空，说明字符串什么内容都没有
        System.out.println("第一个字符串: " + str1);

        //根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串： " + str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串: " + str3);

        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串：" + str4);

    }
}
