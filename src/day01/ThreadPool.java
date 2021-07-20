package day01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//线程池

class NumberThread implements Runnable
{

    @Override
    public void run() {
        for (int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
class NumberThread1 implements Runnable
{

    @Override
    public void run() {
        for (int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        NumberThread numberThread = new NumberThread();
        service.execute(numberThread);//适合使用与Runnable



        NumberThread numberThread1 = new NumberThread();
        service.execute(numberThread1);//适合使用与Runnable
        service.shutdown();
        //service.submit();//适合适用于Callable
    }
}
