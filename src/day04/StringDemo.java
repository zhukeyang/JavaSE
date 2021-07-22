package day04;

import org.junit.Test;

public class StringDemo {
    /*
    * 将字符串进行反转，将字符串中指定部分进行反转
    *
    * */
    public String reverse(String str,int startIndex,int end)
    {
        String s1="abcdefg";
        char[] chars = str.toCharArray();
        for(int x=startIndex,y=end;x<y;x++,y--)
        {
            char temp=chars[x];
            chars[x]=chars[y];
            chars[y]=temp;
        }
        return new String(chars);
    }
    @Test
    public void test1()
    {
        String s1="abcdefg";
        String s = reverse(s1, 1, 4);
        System.out.println(s);
    }
}
