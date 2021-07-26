package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
* Collection接口中声明的方法的测试
* 向Collection接口的实现类的独享添加数据obj的时候，要求obj所在的类要重写equals()
* 结论：
* */
public class CollectionTest {

    @Test
    public void test1()
    {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));
        //contains(Object obj)判断当前集合是否包含obj,判断的是内容不是地址
        //我们在判断的时候会调用obj对象所在的类的equals().
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        //containsAll(Collection coll1):判断形参coll1中所有的元素是否都存在与当前集合中
        Collection coll1= Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }
    @Test
    public void test2()
    {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));
        coll.remove(1237);
        System.out.println(coll);
        //4.removeAll(Collection coll1)：从当前集合中移除coll1中所有的元素（差集操作）
        Collection coll1=Arrays.asList(123,4567);
        coll.removeAll(coll1);
    }
    @Test
    public void test3()
    {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));
//       retainAll（交集）
        Collection coll1 =Arrays.asList(123,456,789);
        coll.retainAll(coll1);
//        6.equals(Object obj):要想返回true，需要判断当前集合和形参集合元素都相同
    }
    @Test
    public void test4()
    {
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("jerry",20));
        System.out.println(coll.hashCode());
        //集合->数组 toArray()
        Object[] arr = coll.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
