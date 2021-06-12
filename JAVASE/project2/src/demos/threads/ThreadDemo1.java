package demos.threads;

public class ThreadDemo1 {
    static class MyThread1 extends Thread {
        private static int tickets = 40;
        @Override
        public void run() {
            while (true){
                if (tickets>0){
                    System.out.println(getName()+"剩余票数："+tickets);
                    tickets--;
                }else {
                    return;
                }
            }
        }

        }
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        myThread1.setName("111111");
        myThread2.setName("222222");
        myThread1.start();
        myThread2.start();
    }
    }
