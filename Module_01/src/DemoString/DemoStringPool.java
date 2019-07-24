package DemoString;
/*
字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中。

对于基本类型来说 == 就是进行数组比较
对于引用类型来说，==就是进行[地址值]进行比较
 */
public class DemoStringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }


}
