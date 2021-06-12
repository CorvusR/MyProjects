package others.io;

import java.io.*;
import java.util.Locale;

public class IO3 {
    public static int count;

    public static void countFile(File sourceFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sourceFile));
        while (br.readLine() != null) {
            count++;
        }
    }

    public static void countDir(String dirName) throws IOException {
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("文件夹不存在");
            return;
        } else {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    if (files[i].getName().toLowerCase(Locale.ROOT).endsWith(".java")) {
                        countFile(files[i]);
                    }
                }
                if (files[i].isDirectory()) {
                    String subDir = dir.getName() + File.separator + files[i];
                    countDir(subDir);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        countDir("C:\\Users\\IT03\\Desktop\\新建文件夹");
        System.out.println(count);
    }
}
