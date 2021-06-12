package Tests.Design;

public class Lazy {
    private static Lazy lazy;

    public Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
