package utils;

import java.time.temporal.Temporal;
import java.util.UUID;

public class IdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
