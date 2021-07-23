package day04;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
* jdk 8之前的测试
*
*
*
* */
public class DateTimeTest {
  /*
  * SimpleDateFormat的使用：对日期Date类的格式化和解析
  * 1.两个操作：格式化，解析
  * */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        /*
        * 实例化SimpleDateFormat
        * */
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);

        String str="2021/7/23 上午10:08";
        Date parse = sdf.parse(str);
        System.out.println(parse);
        //按照指定的方式格式化和解析：调用带参的构造器
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        String format1 = sdf1.format(date);
        System.out.println(format1);
        //解析，从字符串到日期
        Date date1 = sdf1.parse("2021.07.23 10:14:00");
        System.out.println(date1);
    }
    /*
    * 练习一：字符串“2020-09-09”转换为java.sql.Date
    * */
    @Test
    public void test2() throws ParseException {
        String birth="2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = sdf.parse(birth);
        System.out.println(date);
        java.sql.Date birthDate=new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
    /*
    * Calendar日历类（抽象类）
    *
    * */
    @Test
    public void testCalendar()
    {
        /*
        * 1.实例化
        * 方式一：创建其子类(GregorianCalendar)的对象
        * 方式二：调用其静态方法getInstance()
        * */
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());
        //2.常用方法
        //get()
        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        //getTime():日历类-->Date
        Date date=calendar.getTime();
        System.out.println(date);
        //setTime():Date-->日历类
        Date date1=new Date();
        calendar.setTime(date1);
    }
}
