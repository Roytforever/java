package DemoString;

/*
题目：
定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串

分析：
1.首先准备一个int[]数组
2.定义一个方法，用来将数组变为字符串
三要素：
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3.格式
4.调用方法
 */
public class DemoStringPractise {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        String result = fromArrayToString(array);
        System.out.println(result);

    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
            str += "word" + array[i] + "J";
            }else {
                str += "word" + array[i] +"#";
            }
        }
        return str;
    }
}
