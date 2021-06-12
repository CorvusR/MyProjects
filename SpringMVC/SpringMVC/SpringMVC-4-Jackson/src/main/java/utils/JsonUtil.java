package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JsonUtil {
    public static String getTime(Object o, String dateFormat) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        objectMapper.setDateFormat(sdf);
        try {

            return objectMapper.writeValueAsString(o);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getTime(Object o){
        return getTime(o,"yyyy-MM-dd HH:mm:ss");
    }
}
