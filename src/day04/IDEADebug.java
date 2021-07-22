package day04;

import org.junit.Test;

public class IDEADebug {
    @Test
    public void testStringBuffer()
    {
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);


    }
}
