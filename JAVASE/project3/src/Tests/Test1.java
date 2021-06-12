package Tests;

public class Test1 {
    static int x = 0;
    static {x+=10;}

    public static void main(String[] args) {
        System.out.println(Test1.x);
    }
    static {x/=5;}
}
