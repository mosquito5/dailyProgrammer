import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NecklaceMatchingTest {
    NecklaceMatching necklaceMatching = new NecklaceMatching();

    @Test
    public void same_necklaceTrue() {
        assertTrue(necklaceMatching.same_necklace("nicole", "icolen"));
        assertTrue(necklaceMatching.same_necklace("nicole", "lenico"));
        assertTrue(necklaceMatching.same_necklace("aabaaaaabaab", "aabaabaabaaa"));
        assertTrue(necklaceMatching.same_necklace("x", "x"));
        assertTrue(necklaceMatching.same_necklace("", ""));
    }

    @Test
    public void same_necklaceFalse() {
        assertFalse(necklaceMatching.same_necklace("nicole", "coneli"));
        assertFalse(necklaceMatching.same_necklace("abc", "cba"));
        assertFalse(necklaceMatching.same_necklace("xxyyy", "xxxyy"));
        assertFalse(necklaceMatching.same_necklace("xyxxz", "xxyxz"));
        assertFalse(necklaceMatching.same_necklace("x", "xx"));
        assertFalse(necklaceMatching.same_necklace("x", ""));
    }

    @Test
    public void repeats() {
        assertEquals(1, necklaceMatching.repeats("abc"));
        assertEquals(3, necklaceMatching.repeats("abcabcabc"));
        assertEquals(1, necklaceMatching.repeats("abcabcabcx"));
        assertEquals(6, necklaceMatching.repeats("aaaaaa"));
        assertEquals(1, necklaceMatching.repeats("a"));
        assertEquals(1, necklaceMatching.repeats(""));
    }
}
