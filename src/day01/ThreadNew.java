package day01;

//创建线程的方式三：实现callable接口 jdk5.0新增
/*
*
* 1.创建一个实现callable的实现类
* 2.实现call方法，将此线程需要执行的操作声明在call()中
* 3.创建callable接口实现类的对象
* 4.将此callable接口实现类的对象传到FutureTask构造器中，创建FutureTask的对象
* */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class NumThread implements Callable
{

    @Override
    public Object call() throws Exception {
        int sum=0;
        for (int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) throws Exception {
        NumThread numThread=new NumThread();
        FutureTask task = new FutureTask(numThread);
        new Thread((Runnable) numThread).start();
        //get方法的返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
        Object sum = task.get();
        System.out.println(sum);
    }
}
