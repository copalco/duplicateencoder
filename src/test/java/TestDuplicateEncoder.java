import duplicateencoder.DuplicateEncoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDuplicateEncoder {

    private final DuplicateEncoder encoder = new DuplicateEncoder();

    @Test
    public void encodesUniqueCharAsOpeningParenthesis() {
        assertEquals("(", encoder.encode("a"));
    }

    @Test
    public void noParenthesisFromEmptyString() {
        assertEquals("", encoder.encode(""));
    }

    @Test
    public void encodesEachUniqueCharAsOpeningParenthesis() {
        assertEquals("(((", encoder.encode("abc"));
    }

    @Test
    public void encodeNonUniqueCharsAsClosedParenthesis() {
        assertEquals("()()", encoder.encode("abcb"));
    }

}
