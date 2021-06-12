package others.io;

import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\Users\\IT03\\Desktop\\新建文件夹\\1.txt");
        File file1 = new File("C:\\Users\\IT03\\Desktop\\新建文件夹\\2.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        int len = -1;
        while ((len = fileReader.read())!= -1){
            fileWriter.write(len);
        }
        fileWriter.flush();
    }
}
