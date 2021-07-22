package day02;

import org.junit.Test;

/*
* 涉及到string类与其它结构之间的转换
* */
public class StringTest1 {
    @Test
    public void test3()
    {
        String s1="abc123";
        byte[] bytes = s1.getBytes();//使用默认(UTF-8)的字符集，进行转换
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        String s2 = new String(bytes);//使用默认字节码(UTF-8)，进行编码
        System.out.println(s2);


    }
    @Test
    public void test1()
    {
        String s1="123";
        int i = Integer.parseInt(s1);
        String s = String.valueOf(i);
        System.out.println(i);
        System.out.println(s);
    }
    @Test
    public void test2()
    {
        String s1="abc123";
        char[] charArray = s1.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }
        char[] arr=new char[]{'h','e','l','l','o'};
        String s2 = new String(arr);
        System.out.println(s2);
    }
}
