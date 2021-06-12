package others.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IO1 {
    public static void main(String[] args) throws IOException {
        long time;
        File video = new File("D:\\Test\\1.mp4");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(video));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\Test\\2.mp4"));
        int len = -1;
        byte[] bytes = new byte[1024];
        long start = System.currentTimeMillis();
        System.out.println(start);
        while ((len = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(len);
        }
        bufferedOutputStream.flush();
        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(time);
    }
}
