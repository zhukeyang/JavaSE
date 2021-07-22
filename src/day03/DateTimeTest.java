package day03;

import org.junit.Test;

import java.util.Date;

/*
* System类中的currentTimeMillis()
* 两个方法的使用
*   toString();显示当前的年月日时分秒
*   getTime()获取当前Date对象对应的毫秒数
* */
public class DateTimeTest {
    @Test
    public void test1()
    {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
    @Test
    public void test2()
    {
        //构造器一：创建了一个对应当前时间的Date对象,util下的Date
        Date date1 = new Date();
        System.out.println(date1.toString());//Thu Jul 22 16:56:35 CST 2021
        System.out.println(date1.getTime());
        Date date2 = new Date(1550306204104L);
        System.out.println(date2);
        java.sql.Date date3=new java.sql.Date(352235325345L);
        System.out.println(date3);
    }
    @Test
    public void test3()
    {
        //将java.util.Date对象转换为java.sql.Date对象



    }
}
