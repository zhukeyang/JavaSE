package day04;

import org.junit.Test;

import java.util.Arrays;

/*
* 一：Java中的对象，正常情况下，只能进行：== 或 ！=，不能使用>或者<的
*     但是在开发的场景中，我们需要对多个对象进行排序，需要比较对象的大小
*     使用两个接口中的一个Comparable或Comparator
*     对于自定义类来说，如果我们需要比较，我们可以自定义类实现Comparable接口，重写compareTo(obj)方法
*       在compareTo(obj)中指明如何排序
* */
public class CompareTest {
//    Comparable接口使用举例
    @Test
    public void test1()
    {
        String[] arr =new String[]{"AA","CC","BB","DD","EE"};
//        String等包装类实现了Comparable接口，重写了compareTo()方法,给出了比较两个对象大小的比较接口
//        2.重写compareTo()的规则：
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void test2()
    {
        Goods[] arr=new Goods[4];
        arr[0]=new Goods("lianxiangMouse",34);
        arr[1]=new Goods("dellMouse",44);
        arr[2]=new Goods("xiaomiMouse",14);
        arr[3]=new Goods("huaweiMouse",54);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
