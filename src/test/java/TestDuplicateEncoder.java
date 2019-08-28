import duplicateencoder.DuplicateEncoder;
import duplicateencoder.Text;
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
    public void encodesCharsIgnoringCase() {
        assertEquals(")()", encoder.encode("Pxp"));
    }

    @Test
    public void encodeNonUniqueCharsAsClosedParenthesis() {
        assertEquals("()()", encoder.encode("abcb"));
    }

    @Test
    public void characterStream() {
        assertEquals("pxp", new Text("Pxp").characterStream().reduce("", String::concat));
    }
}
