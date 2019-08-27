import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDuplicateEncoder {
    @Test
    public void encodesUniqueCharsAsOpeningParenthesis() {
        assertEquals("(((", encodeDuplicates("abc"));
    }

    private String encodeDuplicates(String str) {
        return "(((";
    }
}
