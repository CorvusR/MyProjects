package others.io;

import java.io.*;

public class IO2 {
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
    public static void copyDirs(String sourceDir,String targetDir) {
        File sourceDirs = new File(sourceDir);
        File targetDirs = new File(targetDir);
        if (!sourceDirs.exists()||!sourceDirs.isDirectory()){
            System.out.println("源文件夹不存在");
            return;
        }
        if (!targetDirs.exists()||!targetDirs.isDirectory()){
            targetDirs.mkdir();
        }
        File[] files = sourceDirs.listFiles();
       try{ for (int i = 0 ; i< files.length;i++){
            if (files[i].isFile()){
                File targetFiles = new File(files[i].getName());
                copyFiles(files[i],targetFiles);
            }else {
                String subSourceDir = sourceDirs.getName()+File.separator+files[i].getName();
                String subTargetDir = targetDirs.getName()+File.separator+files[i].getName();
                copyDirs(subSourceDir,subTargetDir);
            }
        }}catch (IOException e){
           e.printStackTrace();
       }
    }

    public static void main(String[] args) throws IOException {
        copyDirs("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹","D:\\新建文件夹1");
    }
}
