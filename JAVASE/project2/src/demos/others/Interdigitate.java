/*
package demos.others;

import java.io.*;

public class Interdigitate {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\1.txt");
        File f2 = new File("D:\\Users\\XIEHE-IT03\\Desktop\\新建文件夹\\2.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(f1));
        BufferedReader br2 = new BufferedReader(new FileReader(f2));
        String s1;
        String s2;
        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();
        //分别读取ab文件，然后将内容分别存储到所对应的的字符串中
        while ((s1= br1.readLine()) != null) {
            r1.append(s1);
        }
        while ((s2 = br2.readLine()) != null) {
            r2.append(s2);
        }

        int i = 0;
        int lenA = r1.length();
        int lenB = r2.length();
        //判断长度，是为了在如果某一个文件的字符串长度多的情况
        int max = Math.max(lenA, lenB);
        int min = Math.min(lenA, lenB);
        //定义resStr为了去每次取到的结果然后存储到c中
        String rs ;
        //循环i值使其小于长的length，这样会把所有内容遍历，存储
        while (i < max) {
            //当i<min时，这时候是取两个文件字符串的共同长度的值
            if (i < min) {
                char a = r1.charAt(i);
                char b = r2.charAt(i);

            } else {//else表示现在某一个文件被取完了，但另一个文件仍然有值。
                //判断是哪个文件
                if (lenA > lenB) {
                    char a = resA.charAt(i);
                    resStr = a + "\t";
                    bw.write(resStr);
                } else {
                    char b = resB.charAt(i);
                    resStr = b + "*";
                    bw.write(resStr);
                }
            }
            //每次的i++;
            i++;
        }
        //关闭流
        bw.close();
        brA.close();
        brB.close();
        frA.close();
        frB.close();
    }

}
*/
