package DemoString;
/*
字符串的截取方法：
public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串
public String sbustring(int begin，int end)：截取从begin开始，一直到end结束中间的字符串
备注：[begin，end）包含左边，不包含右边
*/
public class DemoSubstring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);//原封不动
        System.out.println(str2);//World，新字符串
        System.out.println("+++++++++++++++++++");

        String str3 = str1.substring(4,7);
        System.out.println(str3);//owo新字符串

        String strA = "Hello";
        System.out.println(strA);//Hello
        strA = "Java";
        System.out.println(strA);//Java
    }
}
