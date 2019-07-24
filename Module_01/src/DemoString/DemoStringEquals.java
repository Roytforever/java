package DemoString;
/*
==是进行对象地址值比较，如果确实需要字符串内容比较，可以用两个方法：

public boolean equals(Object obj):参数可以是任何对象，但是只有参数数字符串而且内容相同才能给true，否则是false
注意：
1.任何对象都能用object进行接收
2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3.如果比较双方一个常量一个变量，推荐把常量写在前面
推荐："abc".equals(str)        不推荐str.equals("abc")

public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较
 */
public class DemoStringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));
        System.out.println("======================");


        String str4 = "hello";
        System.out.println(str1.equals(str4));//false
        System.out.println("======================");


        String str5 = null;
        System.out.println("abc".equals(str5));//推荐
        //System.out.println(str5.equals("abc"));//不推荐：报错，空指针异常NullPointerException
        System.out.println("======================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//false
        System.out.println(strA.equalsIgnoreCase(strB));//true

    }
}
