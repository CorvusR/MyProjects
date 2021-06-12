package others.demo;

import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
      int[] a = new int[3];
      a[0] = 1;
      a[1] = 2;
      a[2] = 3;
      String s = new String(a,0,a.length);
        System.out.println(s);

    }

}
