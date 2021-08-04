package day06;


import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* Set接口存储无序的、不可重复的数据
* HashSet:Set接口的主要实现类，线程不安全的，可以存储null值
* LinkedHashSet:作为HashSet子类，遍历其内部数据时，可以按照添加的顺序遍历
* TreeSet:可以按照添加对象指定属性进行排序
* 说明：
*   Set没有额外定义方法，用的都是Collection的方法
* */
public class SetTest {
    /*
    * Set:无序不可重复
    * 1.无序性：不等于随机性。
    *   存储的数据在底层数组中并非按照数组索引的顺序进行添加，而是根据数据的Hash值进行排序
    * 2.不可重复性:保证添加的元素按照equals()判断时，不能返回true,即相同的元素只能添加一个
    * 3.添加元素的过程：以HashSet为例：
    *
    * */
    @Test
    public void test()
    {
        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(456);
        hashSet.add(789);
        hashSet.add(new Person("Tom",12));
        hashSet.add(new User("Tom",12));
        for (Object o : hashSet) {
            System.out.println(o);
        }
    }
//    LinkedHashSet作为HashSet的子类，在添加数据时，每个数据还维护了两个引用，记录此数据前一个数据和后一个数据
//    优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
    @Test
    public void test1()
    {

        Set set = new LinkedHashSet();
        set.add(123);
        set.add(456);
        set.add(789);
        set.add(new User("Tom",12));
        set.add(new Person("Jerry",13));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}
