package cn.itcast.jdbc;

import java.sql.*;

/**
 * 执行DDL语句
 */
public class JDBCDemo7 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "12345678");
            //3.定义sql
            String sql = "select * from account";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果
            //循环判断游标是否是最后一行末尾。
            while (rs.next()){

                //6.1 让游标向下移动一行
                //6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id + "---" + name + "---" + balance);
            }
            /*//6.处理结果
            //6.1 让游标向下移动一行
            rs.next();
            //6.2 获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);
            System.out.println(id + "---" + name + "---" + balance);

            //6.1 让游标向下移动一行
            rs.next();
            //6.2 获取数据
            int id2 = rs.getInt(1);
            String name2 = rs.getString("name");
            double balance2 = rs.getDouble(3);
            System.out.println(id2 + "---" + name2 + "---" + balance2);*/

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.释放资源
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
