package demos.others;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    public static void main(String[] args) {
        /*Class c = BubbleSort.class;*/
        Class c = null;
        try {
            c = Class.forName("demos.others.BubbleSort");
            String s = "sort";
            try {
                Method m = c.getMethod(s);
                try {
                    m.invoke(c.getConstructor().newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }

            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            /*Field[] fields = c.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }*/
           /* Method[] method = c.getDeclaredMethods();
            for (Method method1 : method) {
                System.out.println(method1);
            }*/
           /* try {
                Constructor<ReceiveThread> constructor = c.getConstructor(Socket.class);
                ReceiveThread receiveThread = constructor.newInstance();
                System.out.println(receiveThread);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("找不到指定类");
        }

    }
}
