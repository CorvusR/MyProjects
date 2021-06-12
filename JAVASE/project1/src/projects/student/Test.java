package projects.student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Implements impl = new Implements();
        int flag;
        do {
            impl.add();
            flag = sc.nextInt();
        }while (flag==1);
        String name = sc.next();
        impl.findByName(name);

    }
}
