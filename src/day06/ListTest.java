package day06;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
* Collection接口：单例集合，用来存储一个一个的对象
* List接口：存储有序的、可重复的数据
* 面试题：ArrayList（底层数组）、LinkedList（底层双向链表）、Vector三者的异同
* 同：三个类都实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
* */
/*
* 常用方法：
*   增：add(Object obj)
*   删：remove(int index)/remove(Object obj)
*   查：get(int index)
*   插：add(index,Object ele)
*   长度：size()
*   遍历：1.迭代器
*        2.增强for循环
* */
public class ListTest {
    @Test
    public void test1()
    {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("AA");
        list.add(new Person("Tom",12));
        System.out.println(list);
        list.add(3,"BB");
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list.size());
//        根据索引获取数据
        System.out.println(list.get(0));
    }
    @Test
    public void test2()
    {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("AA");
        list.add(new Person("Tom",12));
        int i = list.indexOf(456);//返回obj在集合中首次出现的位置，如果不存在，返回-1
        int i1 = list.lastIndexOf(456);//返回obj在集合中最后一次出现的位置，如果不存在，返回-1
        System.out.println(i);
        System.out.println(i1);
        Object remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);
        list.set(1,"CC");
//        返回从2到4位置的左闭右开区间
        list.subList(2,4);
    }
    @Test
    public void test3()
    {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add("AA");
        list.add(new Person("Tom",12));
        for (Object o : list) {
            System.out.println(o);
        }
//    一
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}
