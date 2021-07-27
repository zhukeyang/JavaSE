package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {
    @Test
    public void test1()
    {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));

        //for(集合中元素的类型， 局部变量：集合对象)
        for(Object obj: coll)
        {
            System.out.println(obj);
        }
    }
    @Test
    public void test2()
    {
        int[] arr=new int[]{1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
