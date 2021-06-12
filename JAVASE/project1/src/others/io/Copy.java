package others.io;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Test");
        File file1 = new File("C:\\Users\\IT03\\Desktop\\新建文件夹\\file1.txt");
        /*System.out.println(file2.createNewFile());
      FileInputStream fileInputStream = new FileInputStream(file);
      FileOutputStream fileOutputStream = new FileOutputStream(file2);
      byte[] bytes = new byte[1024];
      while (fileInputStream.read(bytes)!=-1){
          fileOutputStream.write(bytes);*/
        /*FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
            System.out.println(file.isFile());
        }*/
        System.out.println(file.isDirectory());
    }
}
