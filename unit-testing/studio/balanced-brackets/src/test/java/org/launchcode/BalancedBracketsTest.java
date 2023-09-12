package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Testing Correct Bracket Order
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //Test Empty String
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    //characters next to brackets
    @Test
    public void charNextToReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    //characters in and out of brackets
    @Test
    public void charAroundBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    //check with full string inside
    @Test
    public void fullStringInBracket() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    //check if null
    @Test
    public void testNullString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    };
    //Check if unbalanced
    @Test
    public void unBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    };
    //Check if only one bracket
    @Test
    public void onlyOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    };
    //starts with left open bracket
    @Test
    public void leftStartingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    };
    //only one bracket with strings
    @Test
    public void onlyOneBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    };
//Testing for nested brackets
    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));
    }
}