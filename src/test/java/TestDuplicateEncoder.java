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

    @Test
    public void encodesEachUniqueCharAsOpeningParenthesis() {
        assertEquals("(((", encodeDuplicates("abc"));
    }

    @Test
    public void encodeNonUniqueCharsAsClosedParenthesis() {
        assertEquals("()()", encodeDuplicates("abcb"));
    }

    private String encodeDuplicates(String str) {
        String encoded = "";
        if (str.isEmpty()) {
            return encoded;
        }
        for (String c: str.split("")) {
            if (str.indexOf(c) != str.lastIndexOf(c)) {
                encoded += ")";
            } else {
                encoded += "(";
            }
        }
        return encoded;
    }
}
