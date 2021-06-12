package demos.threads;

import java.io.*;

public class Test1 extends Thread {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {

        }
    }

    public static void main(String[] args) {
        File f1 = new File("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\1.txt");
        File f2 = new File("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\2.txt");

        try {
            PrintStream ps1 = new PrintStream(new FileOutputStream(f1));
            ps1.print("World cruel but the fly");
            PrintStream ps2 = new PrintStream(new FileOutputStream(f2));
            ps2.print("is , let bullets");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*  MyRunnable m = new MyRunnable();
        Thread thread1 = new Thread(m);
        Thread thread2 = new Thread(m);
        for (; i < 9; i++) {

        }*/
    }



}

