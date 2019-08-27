import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDuplicateEncoder {
    @Test
    public void encodesUniqueCharAsOpeningParenthesis() {
        assertEquals("(", encodeDuplicates("a"));
    }

    @Test
    public void noParenthesisFromEmptyString() {
        assertEquals("", encodeDuplicates(""));
    }

    private String encodeDuplicates(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String encoded = "(";
        return encoded;
    }
}
