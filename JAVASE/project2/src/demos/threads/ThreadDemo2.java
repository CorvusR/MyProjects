package demos.threads;

public class ThreadDemo2 {
   static class MyRunnable implements Runnable{
       private static int tickets = 50;
       @Override
       public void run() {
          while (true){
              if (tickets>0){
                  System.out.println(Thread.currentThread().getName()+"售出一张，"+"剩余--"+tickets);
                  tickets--;
              }
          }
       }
   }

    public static void main(String[] args) {
       MyRunnable m = new MyRunnable();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.setName("1111");
        t2.setName("2222");
        t1.start();
        t2.start();
    }
}
