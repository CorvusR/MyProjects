import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class AutoCopy {
    public static void copyFiles(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(targetFile));
        int len = -1;
        byte[] bytes = new byte[1024];
        while ((len = bi.read()) != -1) {
            bo.write(bytes, 0, len);
        }
        bo.flush();
        bo.close();
        bi.close();
    }

    public static void copyDirs(String sourceDir, String targetDir) {
        File sourceDirs = new File(sourceDir);
        File targetDirs = new File(targetDir);
        if (!sourceDirs.exists() || !sourceDirs.isDirectory()) {
            System.out.println("源文件夹不存在");
            return;
        }
        if (!targetDirs.exists() || !targetDirs.isDirectory()) {
            boolean mkdir = targetDirs.mkdir();
            if (mkdir) {
                System.out.println("源文件夹存在，准备复制");
            } else {
                System.out.println("源文件夹不存在，请重新确认");
            }
        }else {
            System.out.println("目标文件夹已存在");
        }
        File[] files = sourceDirs.listFiles();
        try {
            assert files != null;
            for (File file : files) {
                if (file.isFile()) {
                    File targetFiles = new File(targetDir + File.separator + file.getName());
                    copyFiles(file, targetFiles);
                } else {
                    String subSourceDir = sourceDirs + File.separator + file.getName();
                    String subTargetDir = targetDirs + File.separator + file.getName();
                    System.out.println(sourceDirs.getName());
                    System.out.println(targetDirs.getName());
                    copyDirs(subSourceDir, subTargetDir);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getRes() {
        StringBuffer s1 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\source\\Test1");
        StringBuffer s2 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\source\\Test2");
        StringBuffer s3 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\source\\Test3");
        StringBuffer s4 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\target\\Test1");
        StringBuffer s5 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\target\\Test2");
        StringBuffer s6 = new StringBuffer("D:\\Users\\XIEHE-IT03\\Desktop\\target\\Test3");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(date);
        StringBuffer buffer1 = s1.append("\\").append(format);
        StringBuffer buffer2 = s2.append("\\").append(format);
        StringBuffer buffer3 = s3.append("\\").append(format);
        StringBuffer buffer4 = s4.append("\\").append(format);
        StringBuffer buffer5 = s5.append("\\").append(format);
        StringBuffer buffer6 = s6.append("\\").append(format);
        String res1 = buffer1.toString();
        String res2 = buffer2.toString();
        String res3 = buffer3.toString();
        String res4 = buffer4.toString();
        String res5 = buffer5.toString();
        String res6 = buffer6.toString();
        List<String> list = new ArrayList<String>();
        list.add(res1);
        list.add(res2);
        list.add(res3);
        list.add(res4);
        list.add(res5);
        list.add(res6);
        return list;
    }

    public static void autoCopy() {
        List<String> res = getRes();
        String folder1 = res.get(0);
        String folder2 = res.get(1);
        String folder3 = res.get(2);
        String folder4 = res.get(3);
        String folder5 = res.get(4);
        String folder6 = res.get(5);
        copyDirs(folder1, folder4);
        copyDirs(folder2, folder5);
        copyDirs(folder3, folder6);
    }

    public static void main(String[] args) {
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                autoCopy();
            }
        };
        Timer myTimer = new Timer();
        myTimer.schedule(t,2500,86400000);
    }
}
