package DemoFile;

import java.io.File;

/*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo04File {
    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
       public boolean isDirectory() ：此File表示的是否为目录。
           用于判断构造方法中给定的路径是否以文件夹结尾
               是:true
               否:false
       public boolean isFile() ：此File表示的是否为文件。
           用于判断构造方法中给定的路径是否以文件结尾
               是:true
               否:false
       注意:
           电脑的硬盘中只有文件/文件夹,两个方法是互斥
           这两个方法使用前提,路径必须是存在的,否则都返回false
    */
    private static void show02() {
        File f1 = new File("D:\\javaproject\\Module02\\src\\DemoFile\\Demo01Fil.java");
        if (f1.isFile()) {
            System.out.println(f1.isDirectory());//false
            System.out.println(f1.isFile());//false
        }
        File f2 = new File("D:\\javaproject\\Module02\\src\\DemoFile\\Demo01File.java");
        if (f2.isFile()) {
            System.out.println(f2.isDirectory());//false
            System.out.println(f2.isFile());//true
        }
    }

    /*
        public boolean exists() ：此File表示的文件或目录是否实际存在。
        用于判断构造方法中的路径是否存在
            存在:true
            不存在:false
     */
    private static void show01() {
        File f1 = new File("D:\\javaproject\\Module02\\src\\DemoFile\\Demo01File.java");
        System.out.println(f1.exists());//true

        File f2 = new File("D:\\javaproject\\Module02\\src\\DemoFile\\Demo01Fil.java");
        System.out.println(f2.exists());//false

        File f3 = new File("javaproject.iml");
        System.out.println(f3.exists());//true

        File f4 = new File("a.txt");
        System.out.println(f4.exists());//false
    }
}
