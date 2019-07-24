package cn.itcast.domain;

import java.util.Date;
/**
 * 封装Emp表数据的JavaBean
 */
public class Emp {
        private int id;
        private String name;
        private String gender;
        private Date join_date;
        private double salary;
        private int dept_id;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Date getJoin_date() {
            return join_date;
        }

        public void setJoin_date(Date join_date) {
            this.join_date = join_date;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public int getDept_id() {
            return dept_id;
        }

        public void setDept_id(int dept_id) {
            this.dept_id = dept_id;
        }

        @Override
        public String toString() {
            return "JDBCDemo8{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", join_date=" + join_date +
                    ", salary=" + salary +
                    ", dept_id=" + dept_id +
                    '}';
        }
}
