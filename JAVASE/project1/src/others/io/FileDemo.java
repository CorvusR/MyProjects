package others.io;

import java.io.*;
import java.util.ArrayList;

public class FileDemo {

    public static void main(String[] args) throws IOException {
       /* File file = new File("D:\\Test");
        FileInputStream fileInputStream = new FileInputStream(file);*/
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\IT03\\Desktop\\新建文件夹\\1.txt");
        int len = -1;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read()) != -1) {
            System.out.print((char)len);
        }
    }
}
