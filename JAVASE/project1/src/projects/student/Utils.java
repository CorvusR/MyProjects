package projects.student;

import java.util.Scanner;

public class Utils {
public static int inputNum(String msg, Scanner sc){
    System.out.println(msg);
    return sc.nextInt();
}
public static String inputString(String msg,Scanner sc){
    System.out.println(msg);
    return sc.next();
}
}
