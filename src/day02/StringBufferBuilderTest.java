package day02;

import org.junit.Test;

/*
* 关于StringBuffer和StringBuilder的使用
*
* */
public class StringBufferBuilderTest {
    /*
    * String、StringBuffer、StringBuilder
    * String:不可变的字符序列；底层结构使用char[]存储
    * StringBuffer:可变的字符序列；线程安全的，效率低的;底层使用char[]存储
    * StringBuilder:jdk5.0新增的,可变的字符序列；线程不安全的，效率高的;底层使用char[]存储
    * */

    @Test
    public void test1()
    {
        StringBuffer s1=new StringBuffer("abc");
        s1.setCharAt(0,'m');
        s1.append(1);
        s1.append("a");
        s1.replace(2,4,"hello");
        s1.insert(2,false);
        s1.reverse();
    }
}
