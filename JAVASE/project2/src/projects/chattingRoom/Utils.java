package projects.chattingRoom;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**构造方法*/
public class Utils {
    private Utils() {
    }

    /**判断非空*/
    public static boolean isEmpty(String str) {
        return null == str || "".equals(str.trim());
    }

    /**判断是否是单独聊天*/
    public static Map<String, String> isSingleChat(String str) {
        if (isEmpty(str)) {
            return null;
        }
        int index = -1;
        if (str.startsWith("@") && (index = str.indexOf(":")) > -1) {
            Map<String, String> map = new HashMap<String, String>();
            String name = str.substring(1, index);
            String message = str.substring(index + 1);
            map.put(name, message);
            return map;
        }
        return null;
    }

    /**文字过滤*/
    public static String filter(String msg) {
        if (msg.isEmpty()) {
            return null;
        }
        return msg.replaceAll("日", "月").replaceAll("干", "湿");
    }

    /**关闭线程*/
    public static void teminateIO(Closeable... closeables) {
        if (closeables == null || closeables.length == 0) {
            return;
        }
        for (Closeable c : closeables) {
            if (c != null) {
                try {
                    c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    c = null;
                }
            }
        }
    }


}
