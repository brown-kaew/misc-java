package brown.kaew.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void equal() {
        Assertions.assertTrue(StringUtils.equal(null, null));
        Assertions.assertTrue(StringUtils.equal("null", "null"));
        String s = "TEST";
        Assertions.assertTrue(StringUtils.equal(s, s));

        Assertions.assertFalse(StringUtils.equal(null, "null"));
        Assertions.assertFalse(StringUtils.equal("null", null));
        Assertions.assertFalse(StringUtils.equal("NULL", "null"));
    }
}