package cn.itcast.jdbc;

import cn.itcast.domain.Emp;
import cn.itcast.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo8 {
    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo8().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }
    /**
     * 查询所有emp对象
     * @return
     */
    public List<Emp> findAll()  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "12345678");
            //3.定义sql
            String sql = "select * from emp";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int dept_id = rs.getInt("dept_id");
                double salary = rs.getDouble("salary");
                String gender = rs.getString("gender");
                Date join_date = rs.getDate("join_date");
                // 创建emp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setDept_id(dept_id);
                emp.setGender(gender);
                emp.setJoin_date(join_date);
                emp.setName(name);
                emp.setSalary(salary);
                //装载集合
                list.add(emp);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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

        return list;
    }

    /**
     * 演示JDBC工具类
     * @return
     */
    public List<Emp> findAll2()  {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
           /* //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "12345678");*/
            conn = JDBCUtils.getConnection();
            //3.定义sql
            String sql = "select * from emp";
            //4.获取执行sql对象
            stmt = conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int dept_id = rs.getInt("dept_id");
                double salary = rs.getDouble("salary");
                String gender = rs.getString("gender");
                Date join_date = rs.getDate("join_date");
                // 创建emp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setDept_id(dept_id);
                emp.setGender(gender);
                emp.setJoin_date(join_date);
                emp.setName(name);
                emp.setSalary(salary);
                //装载集合
                list.add(emp);
            }

        }
         catch (SQLException e) {
            e.printStackTrace();
        }finally {
            /*if (rs!=null){
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
            }*/
            JDBCUtils.close(rs,stmt,conn);
        }

        return list;
    }
}
