package others.tools;

import java.util.Scanner;

public class Conversion {
    static String choose = "y";
    static int c = 1;

    public static void toDecimalism(String number, String radix) {
        int r = Integer.parseInt(radix);
        int out = Integer.parseInt(number, r);//将radix进制数改为十进制数
        System.out.println(out);
    }
public static void toAnotherSystem(String number,String radix){
        int r = Integer.parseInt(radix);
        String res = Integer.toBinaryString(r);
}
    /*public static void toAnotherSystem(String number, String radix) {
        int res = 0, n = 1, temp;
        int num = Integer.parseInt(number);
        int r = Integer.parseInt(radix);
        do {
            temp = num % r;
            res += temp * n;
            num = num / r;
            n *= 10;
        } while (num > 0);
        System.out.println(res);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        do {
            System.out.println("选择你的功能:");
            System.out.println("按1将其他进制数改为十进制数");
            System.out.println("按2将十进制数改为其他进制数");
            System.out.println("按其他键退出");
            String option = sc.next();
            switch (option) {
                case "1":                              //按1后将其他进制数改为十进制数
                    do {
                        System.out.println("请输入你输入数的进制:");
                        String radix = sc.next();
                        int r = Integer.parseInt(radix);
                        if (r < 2 || r > 16) {
                            System.out.println("数值错误！请重新输入！");
                            continue;
                        }
                        System.out.println("请输入你想要操作的数:");
                        String number = sc.next();
                        // TODO: 2020-12-10 判断输入数字是否符合规则
                        char[] arr = number.toCharArray();
                        if (f) {
                            for (int a : arr) {
                                if (a > r) {
                                    System.out.println("数值错误！请重新输入！");
                                    f = false;
                                    break;
                                }
                            }
                            break;
                        }
                        toDecimalism(number, radix);
                        System.out.println("continue? 按y继续，按其他键返回上一级");
                        choose = sc.next();
                    } while (choose.equals("y"));
                    break;
                case "2":                              //按2后将十进制数改为其他进制数
                    do {
                        System.out.println("请输入你想要的进制:");
                        String radix = sc.next();
                        System.out.println("请输入你想要操作的数:");
                        String number = sc.next();
                        // TODO: 2020-12-10 判断输入数字是否符合规则
                        int r = Integer.parseInt(radix);
                        char[] arr = number.toCharArray();
                        if (f) {
                            for (int a : arr) {
                                if (a > r) {
                                    System.out.println("数值错误！请重新输入！");
                                    f = false;
                                }
                            }
                            break;
                        }
                        toAnotherSystem(number, radix);
                        System.out.println("continue? y/n");
                        choose = sc.next();
                    } while (choose.equals("y"));
                    break;
                default:
                    break;
            }
            if (option.equals("1") || option.equals("2")) {
                c = 1;
            } else {
                c = 0;
            }
        } while (c == 1);
        System.out.println("欢迎再次使用");
        sc.close();
    }
}
