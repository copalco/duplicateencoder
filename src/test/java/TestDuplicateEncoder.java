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
        return encoder.encode(str);
    }

}
