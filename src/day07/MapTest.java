package day07;

import org.junit.Test;

import java.util.HashMap;

/*
* Map:双列数据，存储key-value  --类似于高中的函数y=f(x)
    HashMap:作为Map的主要实现类；线程不安全的，效率高；存储null的key和value
    *   LinkedHasMap:保证在遍历map元素时，可以按照元素添加的顺序进行遍历
    *       原因：在原有的HashMap底层结构的基础上，添加了一堆指针
    *            对于频繁的遍历，此类效率高于HashMap
    TreeMap:保证按照添加的key-value对进行排序，实现排序遍历（按key排序）
    *       底层使用红黑树
    HashTable:作为古老的实现类；线程安全，效率低；不可以存储null的key和value
    * properties
    *
    *
    * HashMap的底层实现原理：
    *   jdk7.0之前：数组+链表
    *   jdk8     :数组+链表+红黑树
* * */
public class MapTest {
    @Test
    public void test()
    {
        HashMap map = new HashMap();
        map.put(null,null);
    }
}
