package day02;

import org.junit.Test;

public class StringMethodTest {
    @Test
    public void test1()
    {
        String s1="HelloWorld";
        String s2="helloworld";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.length());
        //charAt返回索引处的字符
        System.out.println(s1.charAt(5));

        System.out.println(s2);
        boolean d = s1.endsWith("d");
        System.out.println(d);
        boolean h = s1.startsWith("h");
        System.out.println(h);
        boolean ll = s1.startsWith("ll", 2);
        System.out.println(ll);
        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("ll",5));
    }
}
