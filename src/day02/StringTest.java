package day02;

import org.junit.Test;

/*
* String的使用
*
*
* */
public class StringTest {

    /*
    *1.常量与常量的拼接结果在常量池中，且常量池中不会存在相同内容的常量，只要其中有一个是变量，结果就在堆中
    *
    * */
    @Test
    public void test3()
    {
        String s1="javaEE";
        String s2="hadoop";
        String s3="javaEEhadoop";
        String s4="javaEE"+"hadoop";
        String s5=s1+"hadoop";
        String s6="javaEE"+s2;
        String s7=s1+s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);
        //inter方法可以直接得到数组的地址
        String s8=s5.intern();//返回得到s8使用的常量值已经已经存在的"javaEEhadoop",返回值就在常量池中.
        System.out.println(s3 == s8);
    }
    @Test
    public void test2()
    {
        //si和s2声明在方法区中的字符串常量池中
        String s1="javaEE";
        String s2="javaEE";
        //s3和s4保存的值在堆空间中
        String s3=new String("javaEE");
        String s4=new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println("*********************************");
        Person p1=new Person("Tom",12);
        Person p2=new Person("Tom",12);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name==p2.name);
        p1.name="Jerry";

    }
//    string字符串，使用一对""引起来表示
    /*
    * String声明为final，不可被继承
    * 2.String实现了Serializable接口，表示字符串是支持序列化的
    *         实现了Comparable接口，表示String可以比较大小
    * 3.String内部定义了final char[] value用于存储字符串数据，数组的元素也不能在修改了
    * 4.String：代表不可变的字符序列
    *   1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值
    *   2.当对现有的字符串进行连接操作时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值
    *   3.调用String的replace方法修改指定的字符，也需要重写指定内存区域赋值，不能使用原有的value进行赋值
    * */

    @Test
    public void test1()
    {
        String s1="abc";
        String s2="abc";
        s1="hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println("**************************");
        String s3="abc";
        s3+="def";
        System.out.println(s3);
        String s4="abc";
        String s5 = s4.replace("a", "m");
        System.out.println(s4);
        System.out.println(s5);
    }
}
