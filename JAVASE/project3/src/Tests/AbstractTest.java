package Tests;

public abstract class AbstractTest {
    public static void main(String[] args) {
        System.out.println("aa");
        test1();
    }

    public static void test1(){
        System.out.println("aa");
    }

    AbstractTest abstractTest =new AbstractTest() {
        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return super.toString();
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
        }
    };


}
