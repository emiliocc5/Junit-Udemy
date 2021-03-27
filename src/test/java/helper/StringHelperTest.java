package helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    private StringHelper helper;

    @Before
    public void setup() {
        helper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstTwoPositions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AInFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
