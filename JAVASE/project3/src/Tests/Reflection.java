package Tests;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    private static Object CollectionTest;

    public static void main(String[] args) {
        String s = "Tests.Reflection";
        try {
            Class<?> clazz = Class.forName("Tests.CollectionTest");
            Field[] fields = clazz.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
