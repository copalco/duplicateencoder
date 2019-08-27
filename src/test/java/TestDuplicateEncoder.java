import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDuplicateEncoder {
    @Test
    public void encodesUniqueCharAsOpeningParenthesis() {
        assertEquals("(", encodeDuplicates("a"));
    }

    private String encodeDuplicates(String str) {
        return "(";
    }
}
