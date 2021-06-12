package demos.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        for (int a = 0; a < 20; a++) {
            System.out.println(a);
            System.out.println(Thread.currentThread().getName());
        }
        return null;
    }
}
public class ThreadDemo3 {


    public static void main(String[] args) {
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> f  = new FutureTask<Integer>(callable);
        FutureTask<Integer> f1 = new FutureTask<Integer>(callable);
         Thread thread = new Thread(f);
        Thread thread1 = new Thread(f1);
        thread1.setName("AAAA");
        thread.setName("BBBB");
        thread.start();
        thread1.start();
    }
}
