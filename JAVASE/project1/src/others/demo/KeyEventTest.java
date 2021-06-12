package others.demo;

public class KeyEventTest {

    public static void main(String[] args) {
        /*char a = 'e';
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        char[] c = b.toCharArray();
        char d = c[0];
        if (d == KeyEvent.VK_SPACE){
            System.out.println("success");
        }*/
        int a = 1024;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        System.out.println(a >> 5);
    }
}
