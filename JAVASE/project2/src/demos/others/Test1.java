package demos.others;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) throws Exception{
        BufferedReader br1 = new BufferedReader(
                new InputStreamReader(new FileInputStream("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\1.txt"), "gb2312"));
        BufferedReader br2 = new BufferedReader(
                new InputStreamReader(new FileInputStream("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\2.txt"), "gb2312"));
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\3.txt"), "gb2312"));
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        String str1;
        while ((str1 = br1.readLine()) != null) {
            list1.add(str1);
        }

        StringBuffer sb = new StringBuffer();
        int len;
        char[] buf = new char[1024];
        while ((len = br2.read(buf)) != -1) {
            sb.append(buf, 0, len);
        }
        String[] bstr = sb.toString().split("\\s");
        for (String str : bstr) {
            System.out.println(str);
            if (str.matches("[a-zA-Z]{1,}")) {
                list2.add(str);
            }
        }

        if (list1.size() <= list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
            for(int i=list1.size();i<list2.size();i++) {
                list3.add(list2.get(i));
            }
        }else {
            for (int i = 0; i < list2.size(); i++) {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
            for(int i=list2.size();i<list1.size();i++) {
                list3.add(list1.get(i));
            }
        }
        for(String str:list3) {
            System.out.print(str+" ");
            bw.write(str);
            bw.write("\r\n");
            bw.flush();
        }
    }
    }

