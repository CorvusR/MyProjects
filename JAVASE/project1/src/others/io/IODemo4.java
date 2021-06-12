package others.io;

import java.io.*;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        InputStream i = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(i));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\IT03\\Desktop\\新建文件夹\\3.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("exit".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
    }
}
