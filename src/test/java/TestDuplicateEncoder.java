import duplicateencoder.Encoder;
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
        Encoder encoder = new Encoder();
        if (str.isEmpty()) {
            return "";
        }
        String encoded = "";
        for (String character: str.split("")) {
            encoded += isDuplicate(character, str) ? ")" : "(";
        }
        return encoded;
    }

    private boolean isDuplicate(String character, String str) {
        return str.indexOf(character) != str.lastIndexOf(character);
    }
}
