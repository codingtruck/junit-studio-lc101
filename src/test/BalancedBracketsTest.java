package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void testOneBracketLeft() {
        String oneBracketLeft = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(oneBracketLeft));
    }
    @Test
    public void  testStringEndsWithClosedBracket() {
        String oneBracketRight = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(oneBracketRight));
    }
    @Test
    public void testEmptyString() {
        String empty = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(empty));
    }
    @Test
    public void testOpposingBrackets() {
        String opposingBrackets = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(opposingBrackets));
    }
    @Test
    public void testTwoOpenBrackets() {
        String twoOpenBrackets = "[[]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(twoOpenBrackets));
    }
    @Test
    public void testTwoClosedBrackets() {
        String twoClosedBrackets = "[]]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(twoClosedBrackets));
    }


}
