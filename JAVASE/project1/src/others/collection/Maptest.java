package others.collection;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {
        String str = "When cherry blossoms , i will back for you.";



            HashMap<Character, Integer> result1 = new HashMap<>(32);
            for (int i = 0; i < str.length(); i++) {
                char curChar = str.charAt(i);
                Integer curVal = result1.get(curChar);
                if (curVal == null) {
                    curVal = 1;
                } else {
                    curVal += 1;
                }
                result1.put(curChar, curVal);
            }
        System.out.println(result1);
        }
        }


