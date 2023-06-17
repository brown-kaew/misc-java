package brown.kaew.util;

public class StringUtils {
    static boolean equal(String s1, String s2) {
        return s1 == s2 || (s1 != null && s1.equals(s2));
    }

}
