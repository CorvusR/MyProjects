package others.io;

import java.io.*;

public class IODemo5 {
    public static void main(String[] args) throws IOException {
        OutputStream o = System.out;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\IT03\\Desktop\\新建文件夹\\3.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(o));
        String s = null;
        while ((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
    }
}
