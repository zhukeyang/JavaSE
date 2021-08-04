package day06;

import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test()
    {
        TreeSet set = new TreeSet();
        set.add(123);
        set.add(456);
        set.add(789);
        for (Object o : set) {
            System.out.println(o);
        }
        set.add(new User("Tom",12));
    }
}
