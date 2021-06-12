public class Hungry {
    private static Hungry hungry = new Hungry();

    private Hungry() {
    }


    public Hungry getInstance() {
        return hungry;
    }

    public static void main(String[] args) {

        Hungry hungry1 = Hungry.hungry.getInstance();
        Hungry hungry2 = Hungry.hungry.getInstance();
        System.out.println(hungry1 == hungry2);
    }

}

