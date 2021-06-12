package others.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\IT03\\Desktop\\新建文件夹\\3.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\IT03\\Desktop\\新建文件夹\\4.txt"));
        String s = null;
        while ((s = br.readLine())!=null){
           char[] chars =  s.toCharArray();
            bw.write(chars);
        }
    }
}
