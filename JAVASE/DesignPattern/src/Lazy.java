class Lazy1 {
    private static Lazy lazy;

    private Lazy1() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
public class Lazy{
    public static void main(String[] args) {
        Lazy lazy1 = Lazy1.getInstance();
        Lazy lazy2 = Lazy1.getInstance();
        System.out.println(lazy1 == lazy2);
    }
}