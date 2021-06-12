import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class AutoCopy {
    public static void copyFiles(File sourceFile, File targetFile) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(targetFile));
        int len = -1;
        byte[] bytes = new byte[1024*1024];
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
                System.out.println(targetDirs.getName() + "源文件夹存在，准备复制");
            } else {
                System.out.println("源文件夹不存在，请重新确认");
            }
        } else {
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
        StringBuffer s1 = new StringBuffer("E:\\ufbak\\ZT001");
        StringBuffer s2 = new StringBuffer("E:\\ufbak\\ZT002");
        StringBuffer s3 = new StringBuffer("E:\\ufbak\\ZT003");
        StringBuffer s4 = new StringBuffer("E:\\ufbak\\ZT004");
        StringBuffer s5 = new StringBuffer("E:\\ufbak\\ZT005");

        StringBuffer t1 = new StringBuffer("\\\\jsxiehepcb.cn\\XIEHE\\database backup\\用友\\ufbak\\ZT001");
        StringBuffer t2 = new StringBuffer("\\\\jsxiehepcb.cn\\XIEHE\\database backup\\用友\\ufbak\\ZT002");
        StringBuffer t3 = new StringBuffer("\\\\jsxiehepcb.cn\\XIEHE\\database backup\\用友\\ufbak\\ZT003");
        StringBuffer t4 = new StringBuffer("\\\\jsxiehepcb.cn\\XIEHE\\database backup\\用友\\ufbak\\ZT004");
        StringBuffer t5 = new StringBuffer("\\\\jsxiehepcb.cn\\XIEHE\\database backup\\用友\\ufbak\\ZT005");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(date);

        /*source*/
        String buffers1 = s1.append("\\").append(format).toString();
        String buffers2 = s2.append("\\").append(format).toString();
        String buffers3 = s3.append("\\").append(format).toString();
        String buffers4 = s4.append("\\").append(format).toString();
        String buffers5 = s5.append("\\").append(format).toString();
        /*target*/
        String buffert1 = t1.append("\\").append(format).toString();
        String buffert2 = t2.append("\\").append(format).toString();
        String buffert3 = t3.append("\\").append(format).toString();
        String buffert4 = t4.append("\\").append(format).toString();
        String buffert5 = t5.append("\\").append(format).toString();


        List<String> list = new ArrayList<String>();
        list.add(buffers1);
        list.add(buffers2);
        list.add(buffers3);
        list.add(buffers4);
        list.add(buffers5);

        list.add(buffert1);
        list.add(buffert2);
        list.add(buffert3);
        list.add(buffert4);
        list.add(buffert5);

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
        String folder7 = res.get(6);
        String folder8 = res.get(7);
        String folder9 = res.get(8);
        String folder10 = res.get(9);

        copyDirs(folder1, folder6);
        copyDirs(folder2, folder7);
        copyDirs(folder3, folder8);
        copyDirs(folder4, folder9);
        copyDirs(folder5, folder10);
    }

    public static void main(String[] args) {
        TimerTask t = new TimerTask() {
            @Override
            public void run() {
                autoCopy();
            }
        };
        Timer myTimer = new Timer();
        myTimer.schedule(t, 2500, 86400000);
    }
}
