package others.io;

import java.io.*;

public class IODemo2 {
    public static void main(String[] args) throws IOException {
        File file =new File("D:\\Test");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\IT03\\Desktop\\新建文件夹\\1"));
        int len = -1;
        while ((len = bis.read())!=-1){
            bos.write(len);
        }
        bos.flush();
        bos.close();
        bis.close();
    }
}
